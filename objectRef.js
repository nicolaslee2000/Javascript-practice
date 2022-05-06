let user = { name: 'John' };

let name2 = user.name;

name2 = 'Pete'; // changed by the "admin" reference

console.log(user.name); // 'Pete', changes are seen from the "user" reference
