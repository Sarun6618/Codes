function fun1()
{
    console.log("I'm Sarun");
    callback();
}
function fun2(callback){
    console.log("I'm Surya");
    callback();
}
function fun3(callback){
    console.log("I'm Kasi teja");
}
fun1(fun2(fun3));