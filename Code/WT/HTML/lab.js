function capital(input) {
    var words = input.split(' ');
    var capitalize = [];
    words.forEach(element => {
        capitalize.push(element[0].toUpperCase() + element.slice(1, element.length));
    });
    return capitalize.join(' ');
}
const string = 'hello im Sarun';
const result = capital(string);
console.log(result);