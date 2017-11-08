$(function(){
    //实例化编辑器
    var ue = UE.getEditor('editor');
    ue.ready(function(){
        ue.setHeight(850);
    });
    $('#save').on("click",function(){
        var articlebody = ue.getContent();
        var title = $('#title').val();
        $.ajax({
        	url:"writeblog/save",
        	type:"post",
        	data:{
        		title:title,
        		articlebody:articlebody
        	},
        	success:function(data){
        		if(data.success){
        			alert(data.msg);
        		}else{
        			alert(data.msg);
        		}
        	}
        	
        });
    });
})



