<?php
/**
 * ContactForm for CakePHP 2.x
 *
 * Copyright 2012-2013 by Patrick Hafner (http://patrickhafner.de)
 *
 * Licensed under The MIT License
 * Redistributions of files must retain the above copyright notice.
 * 
 */

App::uses('CakeEmail', 'Network/Email');
App::uses('Sanitize', 'Utility');

class ContactController extends AppController {

    public $helpers = array('Form');
    public $components = array('Email', 'Auth', 'Session');
    public $uses = array('Contactform');

    public function beforeFilter() {
        parent::beforeFilter();
        $this->Auth->allow('show');
        $this->cacheAction = false;
    }

    public function show() {

        if ($this->request->is('post')) {
            $email = new CakeEmail();
            try {
                $email->config('smtp');
            } catch (Exception $e) {
                Throw new ConfigureException('Config in email.php not found. ' . $e->getMessage());
            }

            $this->Contactform->set($this->request->data['Contactform']);

            if ($this->Contactform->validates()) {
                $data = $this->request->data['Contactform'];
 
                $email->template('contactform', 'cflayout')
                      ->from(Sanitize::clean($data['Mail']))
               //       ->sender(Sanitize::clean($data['Mail']))
                      ->replyTo(Sanitize::clean($data['Mail']))
                      ->viewVars(array('data' => $data))
                      ->subject(__('Contact from site'))
                      ->emailFormat('text')
                      ->send();

                $this->Session->setFlash(__('Contact form was submitted successfully'), 'notif');
                $this->redirect('/');

            }
        }

        $this->calculateSpamCheck();
    }

    private function calculateSpamCheck() {
        $rand1 = rand(1, 10);
        $rand2 = rand(1, 10);

        $this->set('calculation', $rand1 . ' + ' . $rand2);

        $result = $rand1 + $rand2;
        $this->Session->write('Contactform.spamcalc', $result);
        return $result;
    }

}