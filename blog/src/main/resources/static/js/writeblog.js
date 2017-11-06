$(function(){
    //实例化编辑器
    var ue = UE.getEditor('editor');
    ue.ready(function(){
        ue.setHeight(850);
    });
    $('#save').on("click",function(){
        var myblog = ue.editor.getContent();
    });
})



