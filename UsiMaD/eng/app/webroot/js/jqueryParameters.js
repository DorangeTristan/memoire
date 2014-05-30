/* 
 * JQuery de la page Parameters
 */
window.onload = function() {
    for(var i=2;i<=5;i++){
        $('#question_'+i).hide();
    }
    for(var i=2;i<=$('#platforms>option').length;i++){
        $('#language_'+i).hide();
    }
    $("[id^='rules']").hide();
};
$('#TypechoiceCombined').click(function(){
    $('#question_2').show();
    // Affichage ou non des images.
    $("[id^='bulletedList']").show();
    $("[id^='extendedTaskList']").show();
    $("[id^='groupedList']").show();
    $("[id^='multipleExpansionList']").show();
    $("[id^='orderedList']").show();
    $("[id^='reducedTaskList']").show();
    $("[id^='separatedList']").show();
    $("[id^='singleExpansionList']").show();
    $("[id^='tabbedList']").show();
    $("[id^='table']").show();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").show();
    
    $('#download').val("a");
    
    // Suppression de l'affichage des règles ergonomiques
    $("[id^='rules']").hide();
});
$('#TypechoiceSeparated').click(function(){
    for(var i=2;i<=5;i++){
        $('#question_'+i).hide();
    }
    // Remise à défaut des radiobuttons.
    // Combined
    $("[id^='Multiplicitychoice']").prop('checked', false);
    // Combined one by one
    $("[id^='Onebyonechoice']").prop('checked', false);
    // Combined all at once
    $("[id^='Allatoncechoice']").prop('checked', false);
    
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").show();
    $("[id^='spacedList']").hide();
    
    $('#download').val("popUp.rar");
    
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_popup').show();
});
$('#MultiplicitychoiceOnebyone').click(function(){
    $('#question_3').show();
    $('#question_4').hide();
    $('#question_5').hide();
    // Combined all at once
    $("[id^='Allatoncechoice']").prop('checked', false);
    // Affichage ou non des images
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").show();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").show();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").show();
    $("[id^='tabbedList']").show();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("a");
    
    // Suppression de l'affichage des règles ergonomiques
    $("[id^='rules']").hide();
});
$('#MultiplicitychoiceManyatone').click(function(){
    $('#question_3').hide();
    $('#question_4').show();
    $('#question_5').hide();
    // Combined one by one
    $("[id^='Onebyonechoice']").prop('checked', false);
    // Combined all at once
    $("[id^='Allatoncechoice']").prop('checked', false);
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").show();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("multipleExpansionList.rar");
    
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_multipleExpansionList').show();
});
$('#MultiplicitychoiceAllatonce').click(function(){
    $('#question_3').hide();
    $('#question_4').hide();
    $('#question_5').show();
    // Combined one by one
    $("[id^='Onebyonechoice']").prop('checked', false);
    // Affichage ou non des images.
    $("[id^='bulletedList']").show();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").show();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").show();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").show();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").show();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").show();
    
    $('#download').val("a");
    
    // Suppression de l'affichage des règles ergonomiques
    $("[id^='rules']").hide();
});
$('#OnebyonechoiceExtended').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").show();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("extendedTaskList.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_extendedTaskList').show();
});
$('#OnebyonechoiceReduced').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").show();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("reducedTaskList.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_reducedTaskList').show();
});
$('#OnebyonechoiceTabbed').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").show();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("tabbedList.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_tabbedList').show();
});
$('#OnebyonechoiceSingle').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").show();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("singleExpansionList.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_singleExpansionList').show();
});
// Affichage des images seules pour le "combined all at once"
$('#AllatoncechoiceSeparatedlist').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").show();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("separatedList.rar");
    // Affichage des règles ergonomiques
    $('#rules').show();
    $('#rules_separatedList').show();
});
$('#AllatoncechoiceGroupedlist').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").show();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("groupList.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_groupedList').show();
});
$('#AllatoncechoiceBulleted').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").show();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("bulletedList.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_bulletedList').show();
});
$('#AllatoncechoiceOrderedlist').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").show();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("orderedList.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_orderedList').show();
});
$('#AllatoncechoiceSpacedlist').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").hide();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").show();
    
    $('#download').val("spacedList.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_spacedList').show();
});
$('#AllatoncechoiceTable').click(function(){
    // Affichage ou non des images.
    $("[id^='bulletedList']").hide();
    $("[id^='extendedTaskList']").hide();
    $("[id^='groupedList']").hide();
    $("[id^='multipleExpansionList']").hide();
    $("[id^='orderedList']").hide();
    $("[id^='reducedTaskList']").hide();
    $("[id^='separatedList']").hide();
    $("[id^='singleExpansionList']").hide();
    $("[id^='tabbedList']").hide();
    $("[id^='table']").show();
    $("[id^='popup']").hide();
    $("[id^='spacedList']").hide();
    
    $('#download').val("table.rar");
    // Affichage des règles ergonomiques
    $("[id^='rules']").hide();
    $('#rules').show();
    $('#rules_table').show();
});
$('#platforms').change(function(){
    for(var i=1;i<=$('#platforms>option').length;i++){
        $('#language_'+i).hide();
    }
    $('#language_'+$('#platforms').val()).show();
});