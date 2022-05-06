//2

let calculator = {
    read() {
        this.a = prompt("value of a", 0);
        this.b = prompt("value of b", 0);
    },
    sum() {
        let sum = 0;
        for(let key in calculator) {
            sum += typeof calculator[key] === 'string' ? calculator[key] : 0;
        }
        return sum;
    }
};

calculator.read();
console.log(calculator);
console.log(calculator.sum());
