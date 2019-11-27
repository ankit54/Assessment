//object destructuring
let person={
        name:"ankit",
        age:23
    }
let {name,age}=person;
console.log("age = ",age)

displayName(person)
function displayName({name,age}) {
    console.log("name: ",name)
    console.log("age: ",person.age)
}

//array destructuring
let arr=["apple","banana","guava","pine-apple"]
let [fruit1,fruit2]=arr
console.log(fruit1,fruit2)

