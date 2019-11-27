console.log("%c==========var keyword========","color:green")
console.log("a= "+a)
var a;
var b=10;
var a=10;
console.log("a= "+a)
var a=30;
console.log("a= "+a)

if(true){
    var c=40;
    console.log("c inside if block: "+c)
}
console.log("c outside if block:"+c)


for(var i=0;i<4;i++){
    console.log(" i inside loop: "+i)
}
console.log("i outside loop: "+i)




console.log("%c==========let keyword========","color:green")
console.log("a= "+a)
let p;
let q=10;
// let p=10; cannot redeclare
console.log("p= "+a)
// let p=30;
console.log("p= "+a)

if(true){
    let r=40;
    console.log("c inside if block: "+r)
}
// console.log("c outside if block:"+r) //cannot be used outside the function scope


for(let x=0;x<4;x++){
    console.log(" i inside loop: "+x)
}
// console.log("i outside loop: "+x) //cannot be used outside the block scope



console.log("%c==========const keyword========","color:green")
console.log("a= "+a)
const l=10;
const m=10;
// const p=10; cannot redeclare
console.log("p= "+l)
// const p=30;
console.log("p= "+l)

if(true){
    const r=40;
    console.log("c inside if block: "+r)
}
// console.log("c outside if block:"+r) //cannot be used outside the function scope


// for(const z=0;z<4;z++){ //cannot be reassign
//     console.log(" z inside loop: "+z)
// }
// console.log("i outside loop: "+z) //cannot be used outside the block scope

const arr=[10,20,30]
// arr={} //cannot reassign
arr.push(40)
console.log("arr= "+arr)