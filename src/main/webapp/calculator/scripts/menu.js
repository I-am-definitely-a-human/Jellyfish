let selectedValue;

$(document).ready(function() {
    selectedValue = $("#operation-select").val();

    $("div.op-container").hide();

    $(`#${selectedValue}`).show();

    $("#operation-select").on("change", function() {
        selectedValue = $(this).val();

        $("div.op-container").hide();

        $(`#${selectedValue}`).show();
    })
})