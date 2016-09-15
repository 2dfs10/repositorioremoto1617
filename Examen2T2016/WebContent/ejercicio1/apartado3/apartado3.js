$(function() {
  // Checks that at least one checkbox is checked
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
