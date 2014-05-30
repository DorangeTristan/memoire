<?php
//include("/var/www/memories/eng/app/View/language_set.php");
$page_name = $this->params['controller'];
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <?php echo $this->Html->charset(); ?>
        <title>
            <?php echo "Mémoire"; ?>:
            <?php echo $title_for_layout; ?>
        </title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <script src="http://maps.google.com/maps?file=api&amp;v=3&amp;key=AIzaSyDGLILAiLGxS_ag-Id-TGKWBmO6Rs9SEWM" type="text/javascript"></script>


        <?php

        // CSS in /webroot/css
        echo $this->Html->css('bootstrap');
        echo $this->Html->css('bootstrap-responsive');
        echo $this->Html->css('bootstrap-datetimepicker.min');
        echo $this->Html->css('style.css');
        // CSS in /webroot/js
        echo $this->Html->script('bootstrap.js');
        echo $this->Html->script('jquery.js');
        echo $this->Html->script('bootstrap-dropdown.js');
        echo $this->Html->script('bootstrap-button.js');
        echo $this->Html->script('bootstrap-collapse.js');
        echo $this->Html->script('bootstrap-datetimepicker.min');
        echo $this->fetch('meta');
        echo $this->fetch('css');
        echo $this->fetch('script');
        ?>						   
    </head>

    <body onload="initialize();" onunload="GUnload()">
        <div class="container" id='entete'>
            <p style="float: left;">
                &nbsp;
                <?php
                    echo $this->Html->link($this->params['controller'], array('controller' => $this->params['controller']), array('class' => 'chemin'));
                    echo "  >  ";
                    echo $this->Html->link($this->action, array('controller' => $this->params['controller'], 'action' => $this->action), array('class' => 'chemin'));
                ?>
            </p>
            <p style="float:right;">    
                <a class="focus"> English &nbsp;</a>
                <a href="../fr/" class="chemin" > Français &nbsp;</a>
                <a href="../nl/" class="chemin"> Nederlands </a>
            </p>
        </div>
        <div class="container">
            <div class="navbar">
                <div class="navbar navbar-inverse"> 
                    <div class="navbar-inner">
                        <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        
                        <div class="nav-collapse collapse">
                            <ul class="nav">
                                <?php echo $this->element('default'); ?>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <?php echo $this->Session->flash(); ?>
            <?php echo $this->fetch('content'); ?>
            <footer> 
            </footer>
        </div>

        <!-- Le javascript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="../assets/js/jquery.js"></script>
        <script src="../assets/js/bootstrap-transition.js"></script>
        <script src="../assets/js/bootstrap-alert.js"></script>
        <script src="../assets/js/bootstrap-modal.js"></script>
        <script src="../assets/js/bootstrap-dropdown.js"></script>
        <script src="../assets/js/bootstrap-scrollspy.js"></script>
        <script src="../assets/js/bootstrap-tab.js"></script>
        <script src="../assets/js/bootstrap-tooltip.js"></script>
        <script src="../assets/js/bootstrap-popover.js"></script>
        <script src="../assets/js/bootstrap-button.js"></script>
        <script src="../assets/js/bootstrap-collapse.js"></script>
        <script src="../assets/js/bootstrap-carousel.js"></script>
        <script src="../assets/js/bootstrap-typeahead.js"></script>
        <?php echo $scripts_for_layout; ?>
    </body>
</html>
