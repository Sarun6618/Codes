let x=new Set();
let arr=[1,5,6,8,0,1,1];
let a={name: "Ram"};
let b={name: "Krish"};
let c="Nayan";
let d="Krish";

arr.forEach(myfun);
function myfun(item){
  x.add(item);
}
x.add("1");
// x.add(a);
// x.add(b);
// x.add(c);
// x.add(c); // not
// x.add(d);
// x.add(1); 
// x.add(2);
// x.add(1);   // not 
console.log(x);