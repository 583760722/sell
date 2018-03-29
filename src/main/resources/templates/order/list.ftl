<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-bordered table-hover">
                <thead>
                <tr>
                    <th>订单id</th>
                    <th>姓名</th>
                    <th>手机号</th>
                    <th>地址</th>
                    <th>金额</th>
                    <th>订单状态</th>
                    <th>支付状态</th>
                    <th>创建时间</th>
                    <th colspan="2">操作</th>
                </tr>
                </thead>
                <tbody>
                <#list page.content as order>
                <tr>
                    <td>${order.orderId}</td>
                    <td>${order.buyerName}</td>
                    <td>${order.buyerPhone}</td>
                    <td>${order.buyerAddress}</td>
                    <td>${order.orderAmount}</td>
                    <td>${order.getOrderStatusEnum().getMessage()}</td>
                    <td>${order.getPayStatusEnum().getMessage()}</td>
                    <td>${order.createTime}</td>
                    <td><a href="">详情</a></td>
                    <td><a href="">取消</a></td>
                </tr>
                </#list>
                </tbody>
            </table>
        </div>
        <#--分页-->
        <div class="col-md-12 column">
            <ul class="pagination pull-right">
            <#if currentPage lte 1>
                <li class="disabled">
                    <a href="#">Prev</a>
                </li>
            <#else>
                <li>
                    <a href="/sell/seller/order/list?page=${currentPage-1}&size=15">Prev</a>
                </li>
            </#if>
            <#list 1..page.getTotalPages() as index>
                <#if currentPage==index>
                    <li class="disabled">
                        <a href="#">${index}</a>
                    </li>
                <#else>
                    <li>
                        <a href="/sell/seller/order/list?page=${index}&size=${size}">${index}</a>
                    </li>
                </#if>
            </#list>
            <#if currentPage gte page.getTotalPages()>
                <li class="disabled">
                    <a href="#">Next</a>
                </li>
            <#else>
                <li>
                    <a href="/sell/seller/order/list?page=${currentPage+1}&size=#{size}">Next</a>
                </li>
            </#if>

            </ul>
        </div>
    </div>
</div>
</body>
</html>