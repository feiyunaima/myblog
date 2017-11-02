$(function(){
	var speed = 30;
	var miku = $('#mikusilder>ul')[0];
	var mikuSi = $('#mikusilder')[0];
	var mikul = $('#mikusilder>ul>li')[0];
	function Marquee(){
		//console.log(mikuSi.scrollLeft);
		console.log(miku.offsetWidth);
		if(mikuSi.scrollLeft>=mikul.offsetWidth*4){
			mikuSi.scrollLeft = 0;
		}else{
			//console.log(mikuSi.scrollLeft)
			mikuSi.scrollLeft++;
		}
	}
	var myMar = setInterval(Marquee,speed);
	$('.silder').on("mouseenter",function(){
		clearInterval(myMar);
	});
	$('.silder').on("mouseleave",function(){
		myMar = setInterval(Marquee,speed);
	});
}) 