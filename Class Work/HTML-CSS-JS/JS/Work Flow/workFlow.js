function first(){
    setTimeout( function(){
       console.log("1st func")
    },5000) 
    console.log("1st func ended")
}

function Second(){
    console.log("2nd func")
}
first()
Second()


