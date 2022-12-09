function myfun()
{
    console.log(1);
    setTimeout(function(){console.log(2)},1000);
    setTimeout(function(){console.log(3)},0);
    console.log(4);
}
function myfunc1()
{
    console.log(1);
    console.log(2);
    console.log(3);
    console.log(4);
    console.log(5);

}
function myfunc2()
{
    console.log("hey Sarun");
}
function myfunc3(name,callback)
{
    console.log('hey'+" "+name);
    callback();
}
myfunc3("Sarun",myfunc2);