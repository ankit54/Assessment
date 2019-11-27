function sum(...args){
    let value=0
    for (let i = 0; i < args.length; i++) {
        value+=args[i]  
    }
    console.log(args)
    console.log(value)
}
sum(10)
sum(10,20)
sum(10,20,30)