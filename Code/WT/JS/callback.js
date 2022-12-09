function fun1(callback)
{
    console.log("I'm Sarun");
    callback(fun3);
}
function fun2(callback){
    console.log("I'm Surya");
    callback();
}
function fun3(){
    console.log("I'm Kasi teja");
}
fun1(fun2);