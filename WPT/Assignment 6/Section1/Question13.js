function outerFunction() {
    let count = 0;

    return function innerFunction() {
        count++;
        console.log("Count:", count);
    };
}

const counter = outerFunction();

counter();
counter();
counter();