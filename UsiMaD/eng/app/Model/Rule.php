<?php

class Rule extends AppModel {
 public $useTable = 'rule';
    public $primaryKey = 'id';
    public $validate = array(
        'name' => array(
            'rule' => 'notEmpty'
        )
    );
}

?>