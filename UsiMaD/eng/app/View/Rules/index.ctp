<!-- app/View/ErgonomicRules/index.ctp -->

<div class="row-fluid">
        <h4><?php echo __('Ergonomic rules') ?></h4>
        <?php
            if($data == NULL){
                echo $this->Form->create('formTable');
                for ($i=0; $i<count($rules);$i++){
                    echo $this->Form->input($rules[$i]['Rule']['id'], array('label' => ($i+1).". ".$rules[$i]['Rule']['rule'], 'type' => 'checkbox'));
                }
                echo $this->Form->submit('Validate');
                echo $this->Form->end();
            }else{
        ?> 
            <table class="table table-bordered table-striped">
                <th>Rule</th>
                <th>Extended task list</th> 
               <th>Reduced task list</th>
                <th>Tabbed list</th>
                <th>Single expansion list</th>
                <th>Multiple expansion list</th>
                <th>Separated list</th>
                <th>Grouped list</th>
                <th>Bulleted list</th>
                <th>Ordered list</th>
                <th>Spaced list</th>
                <th>Table</th>
                <th>Pop up</th>
                <?php
                    $widgets = array();
                    for ($i=1; $i<=count($data);$i++){
                        if($data[$i] != 0){
                            echo "<tr>";
                                for ($j=0; $j<count($rules);$j++){
                                    if($i == $rules[$j]['Rule']['id']){
                                        
                                        echo "<td>".$rules[$j]['Rule']['rule']."</td>";
                                        foreach ($rules[$j]['Rule'] as $key => $value) {
                                            if($key != 'id' && $key !='id_categoryOfRule' && $key != 'rule'){
                                                if(!array_key_exists($key, $widgets)){
                                                    $widgets[$key]=0;
                                                }
                                                echo "<td>";
                                                if($value){ 
                                                    echo '<img src="../eng/img/validate.jpg" alt="ok" id="validate" />'; 
                                                    $widgets[$key] = ($widgets[$key]+1);
                                                }
                                                else{ echo '<img src="../eng/img/croix.jpg" alt="notOk" id="notValidate" />'; }
                                                echo "</td>";
                                            }
                                        }
                                    }
                                }
                            echo "</tr>";
                        }
                    }
                ?>
            </table>
            <h4><?php echo __('Views that meet rules') ?></h4>
            <?php
                $widgetMax = array();
                $tmp = 0;
                foreach($widgets as $key => $value){
                    if($value > $tmp){
                        $tmp = $value;
                        $widgetMax = array();
                        array_push($widgetMax, $key);
                    }elseif($value == $tmp){
                        array_push($widgetMax, $key);
                    }
                }
                
                for($i=0; $i<count($widgetMax);$i++){
                    for ($j = 0; $j < count($images); $j++) {
                        if($widgetMax[$i] == $images[$j]["Aui"]["name"]){
                            echo '<input class="btn btn-info btn-small" type="button" value="Download '.$widgetMax[$i].'.rar" onclick="window.location=\'./rules/download/'.$widgetMax[$i].'.rar\'"><br>';
                            echo '<img src="../eng/img/balsamiq/'.$widgetMax[$i].'.jpg"  /><br><br>';
                            break;
                        }
                    }
                }
            }
        ?> 
</div>