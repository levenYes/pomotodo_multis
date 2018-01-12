<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>绑定银行卡</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="format-detection" content="telephone=no" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <script src="../../static/js/flexible.js"></script>

    <link rel="stylesheet" href="../../static/css/reset.css">
    <style>
        .top,.takeCode{
            margin-top: 0.8rem;
            height: 0.92rem;
            background: #fff;
            line-height: 0.92rem;
            padding: 0rem 0.32rem;
        }
        img{
            height: 0.28rem;
            margin-top: 0.34rem;
        }
        .bankName{
            height: 0.6rem;
            line-height: 0.6rem;
            padding: 0rem 0.32rem;
            color: #666;
        }
        input{
            font-size: 0.28rem;
            color: #333;
            width: 70%;
            height: .92rem;
        }
        button{
            border: none;
            background: #fff;
        }
        .bankName{
            font-size: 0.28rem;
        }

        .po-r{
            position: relative;
        }
        .bankSelect{
            flex: 1;
            appearance:none;
            -moz-appearance:none;
            -webkit-appearance:none;
            border: none;
            font-size: 14px;
            color: #999;
        }
        .triangle-down{
            display: block;
            position: absolute;
            margin-left: .2rem;
            font-size: 0;
            width: 0;
            height: 0;
            border-left: 4px solid transparent;
            border-right: 4px solid transparent;
            border-top: 4px solid rgb(169, 169, 169);
            top: 0;
            bottom: 0;
            right: 5%;
            margin: auto;
        }
    </style>
</head>
<body>
<div id="titleBar" flex="dir:left">
    <div id="titleBarBack">
        <img src="../../static/img/back.png" alt="" id="back">
    </div>
    <div id="titleBarName">
        <p>绑定银行卡</p>
    </div>
</div>
<div class="top" flex="dir:left main:justify">
    <input id="actualName" name="actualName" type="text" placeholder="请输入真实姓名">
    <img src="/static/img/delete.png" alt="" id="actualNameDel">
</div>
<div class="takeCode" style="margin-top: 0px">
    <div flex="dir:left main:justify" style="border-bottom: 1px solid #f3f3f3;">
        <input id="idCard" name="idCard" type="text" placeholder="请输入身份证号码">
        <img src="/static/img/delete.png" alt="" id="idCardDel">
    </div>
</div>
<div class="takeCode po-r" flex="dir:left main:justify" style="margin-top: 0px">
    <select class="bankSelect" id="bankCode" name="bankCode">
    </select>
    <i class="triangle-down"></i>
</div>

<div class="takeCode" style="margin-top: 0px">
    <div flex="dir:left main:justify" style="border-bottom: 1px solid #f3f3f3;">
        <input id="bankNo" name="bankNo" type="number" placeholder="请输入银行卡号">
        <img src="/static/img/delete.png" alt="" id="bankNoDel">
    </div>
</div>
<div class="takeCode" style="margin-top: 0px">
    <div flex="dir:left main:justify" style="border-bottom: 1px solid #f3f3f3;">
        <input id="mobile" name="mobile" type="number" placeholder="请输入银行预留手机号">
        <button class="getCode" style="color: #ff5151">获取验证码</button>
    </div>
</div>
<div class="takeCode" style="margin-top: 0px">
    <div>
        <input id="verificationCode" name="verificationCode" type="text" placeholder="请输入验证码">
    </div>
</div>
<div style="padding: 0px 16px;margin-top: 80px">
    <button class="downBotton" onclick="submitBind()">确定</button>
</div>
<script src="/static/js/jquery-3.2.1.min.js"></script>
<script src="/static/js/util.js"></script>
<script src="/static/js/bindBankCard.js"></script>
</body>
</html>