function fun1(callback){	
	console.log("Hello Charan.!")
	callback();
	
}

function fun2(){	
	console.log('How are you doing?');
}

fun1(fun2);
