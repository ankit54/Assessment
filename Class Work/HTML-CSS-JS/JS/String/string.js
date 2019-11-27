var str="hello World"

console.log("%c----upper case----","color:green")
var str1=str.toUpperCase()
console.log("upper case= ",str1)

console.log("%c----last case----","color:green")
var str2=str.toLowerCase()
console.log("lower case= ",str2)

console.log("%c----index of----","color:green")
var index=str.indexOf("o",0)
console.log("index of o= ",index)

console.log("%c----include----","color:green")
var include=str.includes("he",0)
console.log("is inclulde?= ",include)

console.log("%c----substr----","color:green")
var str3=str.substr(1,6) //start,end
console.log("substr= ",str3)

console.log("%c----trim----","color:green")
var str4=str.trim()
console.log(str4)

console.log("%c----substring----","color:green")
var str5=str.substring(1,6)//start,length
console.log("substr= ",str5)
