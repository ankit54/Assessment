let pEle=document.createElement("button")
   
function greet1(msg){
    let name=".....Ankit!!"
    //document.write(`${msg} ${name}`)
    var showMsg=document.getElementById("get msg button")
    showMsg.style.display="none"

    document.getElementById("demo").innerHTML=(msg+name)
    pEle.setAttribute("id","remove button")
    pEle.textContent="Remove msg"
    document.body.appendChild(pEle)
    pEle.onclick=function(){
        document.getElementById("demo").innerHTML=null
        pEle.remove()
        showMsg=document.getElementById("get msg button")
        showMsg.style.display="block"
    }
    
    //document.write(`${2+2}`)

}

function greet2(msg){
    let name=".....Ankit!!"
    document.write(`${msg} ${name}`)
    //document.getElementById("demo").innerHTML=(msg+name)
    //document.write(`${2+2}`)
}

function changeFont(){
    let element=document.getElementById("increaseSize")
    element.style.fontSize="100px"
}


function changeFontToOld(){
    let element=document.getElementById("increaseSize")
    element.style.fontSize="10px"
}


function showData(){
    console.log("key pressed")
}