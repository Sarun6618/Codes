function myfun() {
console.log(1);
setTimeout(function(){console.log(2)}, 1000);
setTimeout(function(){console.log(3)}, 0);
console.log(4);
}

function myfun1(){
	console.log(1);
	console.log(2);
	console.log(3);
	console.log(4);
}

myfun();