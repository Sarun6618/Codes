function fun1(callback){
	console.log("I am fun1");
	callback(fun3);
}
function fun2(callback){
	console.log("I am fun2");
	callback();
}
function fun3(){
	console.log("I am fun3");
}

fun1(fun2);