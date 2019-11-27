console.log("Named func-------------")
eat()
function eat(){
    console.log("hii")
}



console.log("Anonymous func-------------")
var x=function (params) {
    console.log(params)
}
x(10)



console.log("Self Envoked func-------------");
(function(x){
	console.log(x)
})("Hello, World!")



console.log("ArroW function----------------")
var div=(val1,val2)=>{
    console.log(val1,val2)
}
div(10,20)

var sum=(i,j)=>i+j
var value=sum(10,3)
console.log(value)