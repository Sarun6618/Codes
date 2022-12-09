const Movies = [
  'Baahubali-1',
  'Baahubali-2',
  'RRR', 
  'Karthikeya-1',
  'Karthikeya-2',
  'God Father'
];

/*
// For loop
for (let i=0; i < Movies.length; i++) {
  console.log(Movies[i]);
}

// While loop
let i = 0;
while (i < Movies.length) {
  console.log(Movies[i]);
  i++;
}
*/

const iterator = Movies[Symbol.iterator]();
 
console.log(iterator.next());  //{ value: 'Baahubali-1', done: false }
console.log(iterator.next());  //{ value: 'Baahubali-2', done: false }
console.log(iterator.next());  //{ value: 'RRR', done: false }
console.log(iterator.next());  //{ value: 'Karthikeya-1', done: false }
console.log(iterator.next());  //{ value: 'Karthikeya-2', done: false }
console.log(iterator.next());  //{ value: 'God Father', done: false }
console.log(iterator.next());  //{ value: undefined, done: true }
