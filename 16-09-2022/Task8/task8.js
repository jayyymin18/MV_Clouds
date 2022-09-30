var birthdate = prompt("Enter your birthdate in format yyyy-mm-dd");
var age = calculateAge(birthdate);
//calculate age from birthdate
function calculateAge(birthdate) {
    var today = new Date();
    var birthDate = new Date(birthdate);
    var age = today.getFullYear() - birthDate.getFullYear();
    var m = today.getMonth() - birthDate.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
        age--;
    }
    return age;
}
//console log age
console.log(calculateAge("1995-12-17"));