$(function() {



    $('#modal_info').on('hide.bs.modal', function() { //提示模糊框隐藏时候触发
        location.reload(); //刷新当前页面
    });



});



function saveCourseId(id) {
    ajax({
            method: 'POST',
            url: 'saveCourseId.action',
            params: "borrowId=" + id,
            type: "json",
            callback: function(data) {
                showInfo('success');
               
        }
    }
    );
}
function saveCourseId(id) {
    ajax({
            method: 'POST',
            url: 'saveCourseId.action',
            params: "borrowId=" + id,
            type: "json",
            callback: function(data) {
                showInfo('success');
               
        }
    }
    );
}



function showInfo(msg) {
    $("#div_info").text(msg);
    $("#modal_info").modal('show');
}
