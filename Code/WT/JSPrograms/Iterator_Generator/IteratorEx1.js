const Movies = {
 a: 'Baahubali-1',
 b: 'Baahubali-2',
 c: 'RRR', 
 d: 'Karthikeya-1',
 e: 'Karthikeya-2',
 f: 'God Father'
};

Movies[Symbol.iterator] = function() {
  const ordered = Object.values(this).sort((a, b) => a - b);
  let i = 0;
  return {
    next: () => ({
      done: i >= ordered.length,
      value: ordered[i++]
    })
  }
}

for (const v of Movies) {
  console.log(v);
}