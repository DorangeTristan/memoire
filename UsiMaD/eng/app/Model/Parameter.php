<?php

class Parameter extends AppModel {
    public $useTable = 'language';
    public $primaryKey = 'id';
    public $displayField = 'name';
    public $validate = array(
        'name' => array(
            'rule' => 'notEmpty'
        )
    );
    public $hasMany = array(
        'Aui' => array(
            'className' => 'Aui',
            'foreignKey' => 'foreign_id',
            'dependent' => false,
            'conditions' => '',
            'fields' => '',
            'order' => '',
            'limit' => '',
            'offset' => '',
            'exclusive' => '',
            'finderQuery' => '',
            'counterQuery' => ''
        )
    );
}

?>