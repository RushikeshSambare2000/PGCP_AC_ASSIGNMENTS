function processNumbers(arr) {
    return arr
        .filter(num => num % 2 === 0)
        .map(num => num * 2)
        .reduce((total, num) => total + num, 0);
}

const result = processNumbers([1, 2, 3, 4, 5, 6]);

console.log("Final Total:", result);