var Person={
    firstname:"Ankit",
    lastname:"Singh",
    age:23,
    gender:'M',
    eat:function(){
        console.log("eating")
    },
    getFullName:function(){
        return this.firstname+this.lastname;
    }
    
}
var firstname=Person.firstname;
var lastname=Person.lastname;
var age=Person.age;
var gender=Person.gender;
Person.eat();
var fullname=Person.getFullName();

console.log("firstname= "+firstname);
console.log("lastname= "+lastname);
console.log("age= "+age);
console.log("gender= "+gender);
console.log("fullname= "+fullname);