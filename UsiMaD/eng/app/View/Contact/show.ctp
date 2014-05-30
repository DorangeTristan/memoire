
<div id="wrapper">
   
    <h4>Please contact us for any information, request or suggestion </h4>
    <div id="form-div" >
        <?php
            echo $this->Html->css('Contactform');
            echo $this->Form->create('Contactform');

            echo $this->Form->input('Contactform.Name', array('label' => __('Name')));
            echo $this->Form->input('Contactform.Mail', array('label' => __('Email')));
            echo $this->Form->input('Contactform.Message', array('type' => 'textarea', 'label' => __('Message')));
            echo $this->Form->label('Contactform.Spamprotection', __('Spam protection') . ', result of: ' . $calculation);
            echo $this->Form->input('Contactform.Spamprotection', array('label' => false, 'autocomplete' => 'off'));

            echo $this->Form->submit('Send');

            echo $this->Form->end();
        ?>
    </div>
</div>