const book = {
    title: "Atomic Habits",
    author: "James Clear",
    yearPublished: 2018,

    displayDetails() {
        console.log(`Title: ${this.title}`);
        console.log(`Author: ${this.author}`);
        console.log(`Year Published: ${this.yearPublished}`);
    }
};

book.displayDetails();