function isEmail(){
    var str=document.getElementById('email').value;
    var myReg = /^[-_A-Za-z0-9]+@([_A-Za-z0-9]+\.)+[A-Za-z0-9]{2,3}$/;
    if(!myReg.test(str))
    return layer.msg('邮箱格式不正确');;
}