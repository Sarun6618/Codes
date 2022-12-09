let arr= "String";   //[1,2,3,4];
let set=new Set(arr);
set.add('a');
set.add('b');
set.add('c');
set.add('d');
set.add('e');
let s1={name:'john',age:17};
let s2={name:'mary',age:18};

set.add(s1);
set.add(s2);
console.log("Set Size:"+ set.size);	//.size
console.log(set.has("S"));		// .has

console.log(set.keys());		//keys()
console.log(set.values());		//values()
console.log(set.entries());		//entries()	compatable with maps


for (let user of set)
{
	console.log( user);
}