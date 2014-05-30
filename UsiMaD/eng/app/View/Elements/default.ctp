<?php $page_name = $this->params['controller']; ?>
<li 
    <?php 
        if ($page_name == "home") {
            echo "class='active'>";
        }
        else 
            echo ">"; echo $this->Html->link('Home', '/home', array('action' => 'index'));
    ?>
</li>
<li 
    <?php 
        if ($page_name == "tree") {
            echo "class='active'>";
        }
        else 
            echo ">"; echo $this->Html->link('Description', '/tree', array('action' => 'index'));
    ?>
</li>
<li 
    <?php 
        if ($page_name == "parameters") {
            echo "class='active'>";
        }
        else
            echo ">"; echo $this->Html->link('Parameters', array('controller'=>'parameters', 'action'=>'index'));
    ?>
</li>
<li 
    <?php 
        if ($page_name == "rules") {
            echo "class='active'>";
        }
        else 
            echo ">"; echo $this->Html->link('Ergonomic rules', array('controller'=>'rules', 'action'=>'index'));
    ?>
</li>
<li 
    <?php 
        if ($page_name == "contact") {
            echo "class='active'>";
        }
        else 
            echo ">"; echo $this->Html->link('Contact', '/contact', array('action' => 'index'));
    ?>
</li>