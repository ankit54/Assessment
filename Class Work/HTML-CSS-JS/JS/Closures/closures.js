function outer(){
    
    let a=10

    function inner(){
        let b=20
        console.log("b = ",b)
        console.log("a = ",a)
    }
    return inner
}
let innerFunc=outer() 
innerFunc() //we cant access the variables of inner function