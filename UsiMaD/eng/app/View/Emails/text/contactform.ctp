<?php
echo sprintf(
"%s: %s
%s: %s

%s:
%s



----------------------------
%s %s",
    __('Name: '), Sanitize::clean($data['Name']),
    __('Email: '), Sanitize::clean($data['Mail']),

    __('Message: '),
    Sanitize::stripAll($data['Message']),

    __('Sent from'), Router::url('/', true)
);