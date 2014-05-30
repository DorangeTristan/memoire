<!-- app/View/Tree/index.ctp -->

<div class="row-fluid">
    
    <div id="zoomer" class="zoomimg zoomtop">+ Larger Image</div>
    <img src="../eng/img/tree.jpg" id="imgTree" width="700" height="525" />
</div>
<?php
    // Chargement du script jquery.
    echo $this->Html->script('jqueryTree.js');
?>