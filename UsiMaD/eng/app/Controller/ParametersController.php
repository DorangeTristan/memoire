<?php
App::uses('Folder', 'Utility');
class ParametersController extends AppController {
    public $uses = array('Parameter', 'Aui', 'Rule', 'CategoryOfRules');
    
    public function index() {
        $languages = $this->getLanguage();
        $images = $this->getAui();
        $this->set(compact('languages'));
        $this->set('images',$images);
        
        $categories = $this->getCategory();
        $this->set('categories',$categories);
        $rules = $this->getRules();
        $this->set('rules',$rules);
    }
    
    public function getLanguage() {
        return $this->Parameter->find('list');
    }
    public function getAui(){
        return $this->Aui->find('all');
    }
    public function getRules(){
        return $this->Rule->find('all');
    }
    public function getCategory(){
        return $this->CategoryOfRules->find('all');
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
?>