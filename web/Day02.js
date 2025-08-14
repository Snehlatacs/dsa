// printNameNtimes.js

function printName(x, s) {
    if (x === 5) {
        return;
    }
    console.log(s);
    printName(x+1, s);
}
 
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question('', (s) => {
    printName(1, s);
    readline.close();
});