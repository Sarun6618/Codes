function* objectEntries(obj) {
    const keys = Object.keys(obj);

    for (const key of keys) {
        yield [key, obj[key]];
    }
}

const student = { name: 'John', gender: 'Male', age: 20 };

for (const [key,value] of objectEntries(student)) {
    console.log(`${key}: ${value}`);
}
