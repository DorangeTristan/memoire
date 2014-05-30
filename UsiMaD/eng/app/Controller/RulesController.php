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
App::uses('Folder', 'Utility');

class RulesController extends AppController {
    public $uses = array('Rule', 'Aui');
    public $formData = null;
    public function index() {
        $rules = $this->Rule->find('all');
        if (!$this->request->is('post')){ 
            $this->set('rules', $rules);
            $this->set('data', NULL);
        }else{
            $this->set('rules', $rules);
            $this->set('data', $this->request->data['formTable']);
            $this->set('images', $this->getAui());
        }
    }
    
    public function getAui(){
        return $this->Aui->find('all');
    }
    
    public function download($name){
        
        $dir = new Folder('./files/');
        $file = $dir->pwd() . '\\' . $name ;
        if (file_exists($file)) {
            header('Content-Description: File Transfer');
            header('Content-Type: application/octet-stream');
            header('Content-Disposition: attachment; filename='.basename($file));
            header('Expires: 0');
            header('Cache-Control: must-revalidate');
            header('Pragma: public');
            header('Content-Length: ' . filesize($file));
            ob_clean();
            flush();
            readfile($file);
        }
        else{
            $errorName="You have not yet made a final choice !";
            if($name!="a"){
                $errorName="The file doesn't exist !";
            }            
            $this->Session->setFlash(__($errorName), 'notif', array('type' => 'error'));
        }
        $this->redirect($this->referer());
    }
}