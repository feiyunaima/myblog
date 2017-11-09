<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/miku.css">
    <link href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/searchbar.css">
    <script src="js/jquery-1.8.3.min.js"></script>
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
                <li><a href="learn">学习收藏</a></li>
                <li><a href="miku">初音ミク</a></li>
                <li><a href="leavewords">评论留言</a></li>
            </ul>
        </nav>
        <div class="container">
            <div class="search bar">
                <a href="">java</a>
                <a href="">linux</a>
                <a href="">oracle</a>
                <a href="">delphi</a>
                <form action="form_action.asp">
                    <input type="text" placeholder="请输入您要搜索的内容...">
                    <button type="submit"></button>
                </form>
            </div>
            <article>
                <ul>
                	<#list articlelist as article>
					    <li>
	                        <h2><a href="article/?id=${article.id }">${article.title! }</a></h2>
 							<p>00 ${article.articlebody! } </p>
 							<span><a href="article/?id=${article.id }">阅读全文></a></span>
                    	</li>	
					</#list>                  
                </ul>
            </article>
        </div>
    </main>
</div>
</body>
</html>