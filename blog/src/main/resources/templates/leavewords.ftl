<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" href="/css/leavewords.css">
    <link rel="stylesheet" href="/css/miku.css">
    <script src="js/jquery-1.8.3.min.js"></script>
    <script src="js/leavewords.js"></script>
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
                <li><a href="miku">初音ミク</a></li>
                <li><a href="leavewords">评论留言</a></li>
            </ul>
        </nav>


        <div class="container">
           
            <video controls="controls" autoplay="autoplay" width="500">
			  <source src="video/mv1.mp4" type="video/mp4" />
			</video> 
            <div class="qiang"></div>
            <form class="say" action="tijiao">
            <div class="user_picture"></div>
            <div class="words">
            <div class="neirong" >
                <textarea></textarea>
            </div>
                <div id="submit">提交</div>
            </div>
            </form>
            <article>
                <ul>
                    <li>
                        <h2><a href="">在DBGRIDEH中加入“合计”行</a></h2>
                        <p>1、将dBGridEh.FooterRowCount := 1
                            2、将DBGridEh.SumList.Active := True;
                            3、将Columns[要求和的字段].Footer.ValueType := vtSum;
                            就行了
                            在FormCloseQuery事件中，将SumList.Active := False,
                            因为在数据集中的数据多了以后，FormClose会让DBGridEh释放所有EhLib资源，
                            会使得退出很慢，所以将SumList.Active := False不会引起退出很慢(慢点也可以啊。)
                        </p>
                    </li>
                    <li>
                        <h2><a href="">在DBGRIDEH中加入“合计”行</a></h2>
                        <p>1、将dBGridEh.FooterRowCount := 1
                            2、将DBGridEh.SumList.Active := True;
                            3、将Columns[要求和的字段].Footer.ValueType := vtSum;
                            就行了
                            在FormCloseQuery事件中，将SumList.Active := False,
                            因为在数据集中的数据多了以后，FormClose会让DBGridEh释放所有EhLib资源，
                            会使得退出很慢，所以将SumList.Active := False不会引起退出很慢(慢点也可以啊。)
                        </p>
                    </li>
                    <li>
                        <h2><a href="">在DBGRIDEH中加入“合计”行</a></h2>
                        <p>1、将dBGridEh.FooterRowCount := 1
                            2、将DBGridEh.SumList.Active := True;
                            3、将Columns[要求和的字段].Footer.ValueType := vtSum;
                            就行了
                            在FormCloseQuery事件中，将SumList.Active := False,
                            因为在数据集中的数据多了以后，FormClose会让DBGridEh释放所有EhLib资源，
                            会使得退出很慢，所以将SumList.Active := False不会引起退出很慢(慢点也可以啊。)
                        </p>
                    </li>
                </ul>
            </article>
        </div>


    </main>


</div>
</body>
</html>