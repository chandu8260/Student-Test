function addIngradient() {
      var name = $.trim($("#ingname").val());
      var qty = $.trim($("#ingqty").val());
      var type = $.trim($("#ingtype").val());
      if (name.length > 0 && qty.length > 0 && type != "select") {
            jQuery.post("ajax.do", {
                  ingname : $("#ingname").val(),
                  ingqty : $("#ingqty").val(),
                  ingtype : $("#ingtype").val(),
                  sno : $("#sno").val()
            }, function(data) {
                  $("#ingname").val("");
                  $("#ingqty").val("");
                  $("#ingtype")[0].selectedIndex=0;
                  $("#result").html(data);
            });
      }
}


