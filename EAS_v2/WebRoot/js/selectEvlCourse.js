$(function() {



    $('#modal_info').on('hide.bs.modal', function() { //提示模糊框隐藏时候触发
        location.reload(); //刷新当前页面
    });
    	

        $('#addAdmin').click(function () {

    	 if (!validAddAdmin()) {
            return;
        }
    	var postdata = "username="+$.trim($("#addUsername").val())+"&name="+$.trim($("#addName").val())+"&phone="+ $.trim($("#addPhone").val());
    	ajax(
        		  {
    			  	method:'POST',
    	    		url:'admin/adminManageAction_addAdmin.action',
    				params: postdata,
    	    		callback:function(data) {
    					if (data == 1) {
    						$("#addModal").modal("hide");//关闭模糊框		
    						showInfo("添加成功");	

    	                }else if (data == -1) {
    						$("#addModal").modal("hide");//关闭模糊框		
    						showInfo("该管理员已存在");	
    					}else {
    						$("#addModal").modal("hide");//关闭模糊框
    						showInfo("添加失败");
    					}
    								
    				}
    			}
    			   
        	);
    			
    		
    	});
    	



});


function findCourse() {
	window.location.href='RFTeacherevaluationaction.action?id=Evl'
    
}

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
