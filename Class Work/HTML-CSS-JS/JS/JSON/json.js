const person={
    name:"Sindari",
    age:25,
    weight:60,
    hobbies:["music","singing"]
}

const json=JSON.stringify(person)
console.log("JSON Object: "+json)

const jsObject=JSON.parse(json)
console.log("JS Object= ",jsObject)