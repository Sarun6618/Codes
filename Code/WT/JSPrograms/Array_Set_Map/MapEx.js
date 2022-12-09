let map=new Map();
map.set(1, "Student1");
map.set(2, "Student2");
map.set(3, "Student3");
map.set('1', "Student1");
map.set('2', "Student2");
map.set('3', "Student3");

console.log(map.size);		// .size
console.log(map.get(1));		// .get		key
console.log(map.has(1));		// .has    key
console.log(map.delete('3'));		// .delete    key
//console.log(map.clear());		// .clear     
console.log(map.keys());		// .keys ()
console.log(map.values());		// .values() 
console.log(map.entries());		// .entries() 



for (let stu of map )
{
	console.log(stu);
}
