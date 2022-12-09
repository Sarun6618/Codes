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

function myfun1(){
	console.log("Hi Charan.!");
	}
function myfun2(){
	console.log('How are you doing?');
}



function myfun3(name, callback) {
    console.log('Hi' + ' ' + name);
    callback();
}
myfun3("Charan", myfun2);

//setTimeout(myfun2,2000);
//myfun3();
//myfun1();

//setInterval(function() {element.innerHTML += "Hello"}, 1000);