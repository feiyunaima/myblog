<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/writeblog.css">
    <script src="/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="/ueditor/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="/ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript" charset="utf-8" src="/js/writeblog.js"></script>
    <script type="text/javascript" charset="utf-8" src="/js/scroll.js"></script>
    <script>
        window.UEDITOR_HOME_URL = "/utf8-jsp"
    </script>
</head>
<body>
<div class="bg">
    <main>
        <header>
            <img src="/images/logo.png" alt="">
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
            <article>
                <div>
                    <div class="title">
                        <span >标题</span><input  type="text" placeholder="坚持点滴的积累...">
                        <a id="save" href="aaa">保存提交</a>
                    </div>

                    <script id="editor" type="text/plain" style="width:1024px;height:500px;">


                    </script>
                </div>
                <div id="qiang"></div>

            </article>
        </div>
    </main>


</div>

</body>
</html>