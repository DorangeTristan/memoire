<!-- app/View/Parameters/index.ctp -->

<div class="row-fluid">
    <div class="span6">
        <h4><?php echo __('Parameters') ?></h4> 
        <?php
            echo $this->Form->input('platforms',array('type'=>'select','options'=>$languages));
        ?>
        <div>
            Do you want the data to display are
            <br>
            <?php
                echo $this->Form->radio(
                    'typechoice', 
                    array('combined' => 'Combined','separated' => 'Separated'),
                    array('legend' => false)   
                );                
            ?>
        </div>
        <div id="question_2">
            If the data are combined, must they be displayed
            <br>
            <?php
                echo $this->Form->radio(
                    'multiplicitychoice', 
                    array(
                        'onebyone' => 'One by one',
                        'manyatone' => 'Many at one',
                        'allatonce' => 'All at once'
                    ),array('legend' => false)   
                );                
            ?>
        </div>
        <div id="question_3">
            If the data are combined one by one, must they be displayed like
            <br>
            <?php
                echo $this->Form->radio(
                    'onebyonechoice', 
                    array(
                        'extended' => 'Extended task list',
                        'reduced' => 'Reduced task list',
                        'tabbed' => 'Tabbed list',
                        'single' => 'Single expansion list'
                    ),array('legend' => false)   
                );                
            ?>
        </div>
        <div id="question_4">
            If the data are combined many at one, they will be displayed as "Multiple expansion list".
        </div>
        <div id="question_5" style="float: top;">
            If the data are combined all at once, must they be displayed like
            <br>
            <?php
                echo $this->Form->radio(
                    'allatoncechoice', 
                    array(
                        'separatedlist' => 'Separated list',
                        'groupedlist' => 'Grouped list',
                        'bulleted' => 'Bulleted list',
                        'orderedlist' => 'Ordered list',
                        'spacedlist' => 'Spaced list',
                        'table' => 'Table'
                    ),array('legend' => false)   
                );                
            ?>
        </div>

    </div>
    <div class="span6">
        <h4><?php echo __('Views') ?></h4>
        <input class="btn btn-info btn-small" type="button" value="Download XML" onclick="window.location='./parameters/download/'+document.getElementById('download').value;">
        <?php
            for ($i=1; $i<=count($languages);$i++){
                echo '<div id="language_'.$i.'">';
                for ($j = 0; $j < count($images); $j++) {
                    if($i == $images[$j]["Aui"]["foreign_id"]){
                        echo '<div class="span5 divImage" id="'.$images[$j]["Aui"]["name"].'">';
                            echo '<img src="../eng/img/'.$images[$j]["Aui"]["url"].'" id="imgAui" />';
                            echo $images[$j]["Aui"]["description"];   
                        echo '</div>';
                    }
                }
                echo '</div>';
            }
            
            
        ?>
    </div>
</div>
<div class="row-fluid">
    <?php
    echo '<div id="rules" >';
            ?>
            <h4><?php echo __('Categores of ergonomics rules') ?></h4>
            <?php
            $listAui = array();
            for ($j = 0; $j < count($images); $j++){
                if(!in_array($images[$j]['Aui']['name'], $listAui)){
                    array_push($listAui, $images[$j]['Aui']['name']);
                
                echo '<div id="rules_'.$images[$j]['Aui']['name'].'" >';
                for($k=0; $k<count($categories); $k++){
                    $id = 'aui_'. $images[$j]['Aui']['name'] . $categories[$k]['CategoryOfRules']['id'];
                    $name = $categories[$k]['CategoryOfRules']['name'];
                    echo '<button class="btn btn-info btn-small" id="' . $id . '" style="width:270px;" onClick="if(!$(\'#' . $id . 'cat\').is(\':visible\')){ $(\'#' . $id . 'cat' . '\').fadeIn(\'slow\'); } else { $(\'#' . $id. 'cat' . '\').fadeOut(\'fast\'); }" >' . $name . '</button><br>';
                    echo '<div id="' . $id . 'cat" style="display:none">';

                    foreach ($rules as $rule) {
                        if($categories[$k]['CategoryOfRules']['id'] == $rule['Rule']['id_categoryOfRule']){
                            if($rule['Rule'][$images[$j]['Aui']['name']]){ echo '<img src="../eng/img/validate.jpg" alt="ok" id="validate" />'; }
                            else{ echo '<img src="../eng/img/croix.jpg" alt="notOk" id="notValidate" />'; }
                            echo $rule['Rule']['rule'].'<br>';
                        }
                    }
                    echo '</div>';
                }
                echo '</div>';
                }
            }
            echo '</div>';
            ?>
</div>
<input type="hidden"  id="download"  value="a">
<?php
    // Chargement du script jquery.
    echo $this->Html->script('jqueryParameters.js');
?>
