$(function(){
    //TODO 高度自适应，背景
    $(window).scroll(function(){
        if($(document).height>2000){
            console.log(2000);
            $(body).css("background","url('/images/timg.jpg') no-repeat bottom left");
        }
    });
})
