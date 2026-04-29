// Regular Function
function areaRectangle(length, width) {
    return length * width;
}

console.log("Area (Regular Function):", areaRectangle(10, 5));

// Arrow Function
const areaArrow = (length, width) => length * width;

console.log("Area (Arrow Function):", areaArrow(8, 4));