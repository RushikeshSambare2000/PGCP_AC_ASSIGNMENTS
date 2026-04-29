function delayedExecution(callback) {
    setTimeout(() => {
        callback();
    }, 2000);
}

delayedExecution(() => {
    console.log("Executed after 2 seconds");
});