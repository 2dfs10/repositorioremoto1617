$(function() {
  // Comprueba que hay almenos un checkbox seleccionado
  var requiredCheckboxes = $(':checkbox[required]');
  requiredCheckboxes.change(function()
  {
    if(requiredCheckboxes.is(':checked'))
    {
      requiredCheckboxes.removeAttr('required');
    }
    else
    {
      requiredCheckboxes.attr('required', 'required');
    }
  });
});
