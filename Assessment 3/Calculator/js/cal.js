//function that display value 
function dis(val) 
{ 
    if(val!=undefined){
    document.getElementById("result").value+=val }
    else{
        document.getElementById("result").value+=0 
    }
} 
  
//function that evaluates the digit and return result 
function solve() 
{ 
    let x = document.getElementById("result").value
    let y=eval(x) 
     
    document.getElementById("result").value = y 
} 
  
//function that clear the display 
function clr() 
{ 
    document.getElementById("result").value = "" 
} 