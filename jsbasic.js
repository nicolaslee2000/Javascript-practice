function checkAge(age) {
    return age > 18 ? true : confirm('Did parents allow you?');

}
checkAge(25);
function checkAge(age) {
    return age > 18 || confirm('Did parents allow you?');
}
checkAge(15);