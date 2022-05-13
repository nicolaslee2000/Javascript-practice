//find all images without alternate text
//and give them a red border
function test01() {
    var images = document.getElementsByTagName('img');
    for (var i = 0; i < images.length; i++) {
        if (!images[i].alt) {
            images[i].style.border = '3px solid red';
        }

    }
}

//count from 1 to 10
function countFrom1To10() { //function declaration 
    for (var i = 1; i <= 10; i++) {
        console.log(i);
    }
}

//generate fibonacci sequence
function fibonacci(length) {
    var fib = [0, 1];
    for (var i = 2; i < length; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib;
}