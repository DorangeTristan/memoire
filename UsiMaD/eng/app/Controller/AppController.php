<?php

/**
 * Application level Controller
 *
 * This file is application-wide controller file. You can put all
 * application-wide controller-related methods here.
 *
 * PHP 5
 *
 * CakePHP(tm) : Rapid Development Framework (http://cakephp.org)
 * Copyright 2005-2012, Cake Software Foundation, Inc. (http://cakefoundation.org)
 *
 * Licensed under The MIT License
 * Redistributions of files must retain the above copyright notice.
 *
 * @copyright     Copyright 2005-2012, Cake Software Foundation, Inc. (http://cakefoundation.org)
 * @link          http://cakephp.org CakePHP(tm) Project
 * @package       app.Controller
 * @since         CakePHP(tm) v 0.2.9
 * @license       MIT License (http://www.opensource.org/licenses/mit-license.php)
 */
App::uses('Controller', 'Controller');

/**
 * Application Controller
 *
 * Add your application-wide methods in the class below, your controllers
 * will inherit them.
 *
 * @package       app.Controller
 * @link http://book.cakephp.org/2.0/en/controllers.html#the-app-controller
 */
// app/Controller/AppController.php
class AppController extends Controller {

    public $helpers = array('Text', 'Form', 'Html', 'Session');
    public $components = array(
        'Session',
        'Auth' => array(
            'loginAction' => array ('controller'=>'users', 'action'=>'login', 'prefix' => false, 'user' => false, 'admin' => false),
            'loginRedirect' => array('controller' => 'home', 'action' => 'index', 'prefix' => false, 'user' => false, 'admin' => false),
            'logoutRedirect' => array('controller' => 'home', 'action' => 'index', 'user' => false, 'admin' => false)
        )
    ); 

    public function isAuthorized($user) {

        // Admin can access every action
        if (isset($user['role']) && $user['role'] === 'admin') {
            return true;
        }
        $roles = array(
            'admin' => 10,
            'user' => 5
        );
        if (isset($roles[$this->request->params['prefix']])) {
            $lvlAction = $roles[$this->request->params['prefix']];
            $lvlUser = $roles[$user['role']];
            if ($lvlUser >= $lvlAction) {
                return true;
            } else {
                return false;
            }
        }
        // Default deny
        return false;
 
    }

    public function beforeFilter() {
        //Ceci enleve du url le /admin/users/add si on est pas connecté => redirection vers /eng/users/login et non /eng/admin/users/login
        $this->Auth->loginAction = array('controller' => 'users', 'action' => 'login', 'prefix' => false, 'admin' => false, 'user'=>false);
        $this->Auth->authorize = array('Controller');
        // s'il n'y a pas de prefixe on autorise
        if (!isset($this->request->params['prefix'])) {
            $this->Auth->allow();
        }
        if(isset($this->request->params['prefix']) && $this->request->params['prefix'] == 'admin'){
            $this->layout = 'admin'; // Layout partie Admin
	}
        if(isset($this->request->params['prefix']) && $this->request->params['prefix'] == 'user'){
           $this->layout = 'user'; // Layout partie user
        }

    }

}
