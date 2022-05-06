//1
let user = {
    id: null
};
user.name = "john";
user.surname = "Smith";
user.name = "Pete";

delete user.name;
for(key in user) {
    console.log(key);
}
//2
function isEmpty(obj) {
    for(prop in obj) {
        return false;
    }
    return true;
}

let schedule = {};
console.log(isEmpty(schedule));
schedule["8:30"] = "js is weird";
console.log(isEmpty(schedule));

//3
let salaries = {
    John: 100,
    Ann: 160,
    Pete: 130
}
function calcSum(salaries) {
    let sum = 0;
    for(prop in salaries) {
        sum += typeof salaries[prop] == 'number' ? salaries[prop] : 0; 
    }
    
    return sum;
}

console.log(calcSum(salaries));
//4
let menu = {
    width: 200,
    height: 300,
    title: "My menu"
};
  
function multiplyNumeric(menu) {
    for(let prop in menu) {
        if(typeof menu[prop] === 'number')
            menu[prop] *= 2;
    }
}

multiplyNumeric(menu);
console.log(JSON.stringify(menu));