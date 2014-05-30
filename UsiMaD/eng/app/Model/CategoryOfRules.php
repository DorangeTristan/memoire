<?php

class CategoryOfRules extends AppModel {
 public $useTable = 'categoryofrules';
    public $primaryKey = 'id';
    public $validate = array(
        'name' => array(
            'rule' => 'notEmpty'
        )
    );
}

?>