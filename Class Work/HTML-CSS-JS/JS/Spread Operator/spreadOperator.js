let person={
    name:"ankit",
    age:23
}
let address={
    city:"bangalore",
    pincode:860029
}
let personAddress={
    ...person,
    ...address
}

console.log(personAddress)


//array
let arr1=[10,20]
let arr2=["ankit","kunal"]
let arr1arr2=[
    ...arr1,
    ...arr2
]
console.log(arr1arr2)

let arr3=arr1.concat(arr2)
console.log(arr3)