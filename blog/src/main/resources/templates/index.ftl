<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/miku.css">
    <script src="js/jquery-1.8.3.min.js"></script>
    <script src="js/miku.js"></script>
</head>
<body>
<div class="bg">
    <main>
        <header>
            <img src="images/logo.png" alt="">
        </header>
        <nav>
            <ul>
                <li><a href="index">首页</a></li>
                <li><a href="writeblog">写博</a></li>
                <li><a href="myblog">我的博客</a></li>
                <li><a href="heart">心情历程</a></li>
                <li><a href="miku">初音ミク</a></li>
                <li><a href="leavewords">评论留言</a></li>
            </ul>
        </nav>
        <div class="container">
            <div class="silder" id="mikusilder">
                <ul>
                    <li><img src="images/miku01.jpg" alt=""></li>
                    <li><img src="images/miku02.jpg" alt=""></li>
                    <li><img src="images/miku03.jpg" alt=""></li>
                    <li><img src="images/miku04.jpg" alt=""></li>
                    <li><img src="images/miku01.jpg" alt=""></li>
                    <li><img src="images/miku02.jpg" alt=""></li>
                    <li><img src="images/miku03.jpg" alt=""></li>
                </ul>
            </div>
            <article>
                 <ul>
                	<#list articlelist as article>
					    <li>
					    <div class="inner">
	                        <h2><a href="article/?id=${article.id }">${article.title! }</a></h2>
 							<p>00 ${article.articlebody! } </p>
 							<span><a href="article/?id=${article.id }">阅读全文></a></span>
 						 <div>	
                    	</li>	
					</#list>                  
                </ul>
            </article>


        </div>


    </main>


</div>
</body>
</html>