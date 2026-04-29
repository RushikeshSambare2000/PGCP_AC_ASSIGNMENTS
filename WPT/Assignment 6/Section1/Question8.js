const cart = [
    { item: "Shirt", price: 500 },
    { item: "Shoes", price: 1200 },
    { item: "Watch", price: 2500 }
];

const totalPrice = cart.reduce((total, item) => total + item.price, 0);

console.log("Total Price:", totalPrice);