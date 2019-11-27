var fruit=["Apple","Orange","Chiku","Watermelon"];



console.info("%c==============before push==============","color:green")
fruit.forEach(function (value,index) {
    console.log(value)
})
var push=fruit.push("Banana")
console.info("%c=============after push================","color:green")
fruit.forEach(function (value,index) {
    console.log(value)
})
console.log("length after pushing= "+push)



console.info("%c============before pop==============","color:green")
fruit.forEach(function (value,index) {
    console.log(value)
})
var pop=fruit.pop()//remove last element from array
console.info("%c===========after pop=================","color:green")
fruit.forEach(function (value,index) {
    console.log(value)
})
console.log("popped element= "+pop)



console.info("%c==============before shift=============","color:green")
fruit.forEach(function (value,index) {
    console.log(value)
})
var shift=fruit.shift() //remove 1st element from array
console.info("%c==============after shift===============","color:green")
fruit.forEach(function (value,index) {
    console.log(value)
})
console.log("shifted element= "+shift)


console.info("%c============before unshift===============","color:green")
fruit.forEach(function (value,index) {
    console.log(value)
})
var unshift=fruit.unshift("Guava") //add 1st element from array
console.info("%c==============after unshift===============","color:green")
fruit.forEach(function (value,index) {
    console.log(value)
})
console.log("length after un-shifting= "+unshift)



console.info("%c==============after indexOf===============","color:green")
var index=fruit.indexOf("Orange")
console.log("index of Orange= "+index)


console.info("%c==============after Join===============","color:green")
var fruit1=fruit.join("/")
console.log(fruit1)


console.info("%c==============after Splice===============","color:green")
console.log("Removed Elemented= "+fruit.splice(1,2,"Pine-Apple"))
fruit.forEach(function (value,index) {
    console.log(value)
})


console.info("%c==============after Slice===============","color:green")
console.log("Removed Elemented= "+fruit.slice(1,2,"Pine-Apple"))
console.info("%c=========Fruit array doesnot changes after Slice()","color:green")
fruit.forEach(function (value,index) {
    console.log(value) //fruit remain same after slice()..it dnot update the fruit array
})




console.log("%c=====number Array==========","color:brown")
var number1=[100,50,200,300,20,100,300]

console.info("%c=========before Filter======","color:brown")
console.log(number1)
console.info("%c=========after Filter========","color:brown")
var number2=number1.filter(function (num,index) {
    if(num>100){
        return true
    }
    else{
        return false
    }
})
console.log(number2)





console.info("%c=========after Filter using arrow function========","color:brown")
var number3=number1.filter((num)=>num>100)
console.log(number3)



console.info("%c=========before Map======","color:brown")
console.log(number1)
console.info("%c=========after Map  (add 50)  ========","color:brown")
var number4=number1.map(function(value,index){
    var val=value+50;
    return val
})
console.log(number4)




console.info("%c=========before Map without arrow function======","color:brown")
console.log(number1)
console.info("%c=========after Map using arrow function========","color:brown")
var number5=number1.map((num)=>num+100)
console.log(number5)



console.info("%c=========include func========","color:brown")
var chocolates=["silk","fruits n nuts","kitkat","dark chocolate"]
var extraChocolates=chocolates.includes("kaccha mango bite") //return true/false
console.log("Has extra Chocolate",extraChocolates)




console.info("%c=========isArray func========","color:brown")
var isArrayChoc=Array.isArray(chocolates)
console.log("chocolates is array ? = ",isArrayChoc)

