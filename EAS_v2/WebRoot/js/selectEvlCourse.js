$(function() {



    $('#modal_info').on('hide.bs.modal', function() { //提示模糊框隐藏时候触发
        location.reload(); //刷新当前页面
    });



});
/*
$(document).ready(function(){
    //解决file的change事件只能执行一次的问题
	
	$.ajax({
        method: 'POST',
        url: 'RFTeacherevaluationaction.action',
        params: null,
        type: "json",
        callback: function(data) {
            windows.alert('success');
           
    }
}
);
});
*/


function saveCourseId(id) {
    $.ajax({
            method: 'GET',
            url: 'SavaCourseIdAction.action?courseId=' + id,
      
            callback: function(data) {
                window.alert('success');
               
        }
    }
    );
}

function saveEvl() {
    $.ajax({
            method: 'POST',
            url: 'TeachEvaluation.action',
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
