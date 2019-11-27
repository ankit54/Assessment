
//callback function
function first1(callback){
    setTimeout( function(){
       console.log("1st func")
       callback()
    },5000) 
    console.log("1st func ended")
}

function Second1(){
    console.log("2nd func")
}
first1(Second1)


