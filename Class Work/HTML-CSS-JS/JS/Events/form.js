function validateForm(){
    let userName=document.forms["loginForm"]["username"]
    let password=document.forms["loginForm"]["password"]
    console.log(userName+" "+password)
    if (userName.value.length < 5 && password.value.length > 5) {
        document.getElementById("msg1").style.display="block"
    }
    else {
        
        document.getElementById("msg1").style.display="none"
    }
    if (userName.value.length > 5 && password.value.length < 5) {
        document.getElementById("msg2").style.display="block"
    }
    else {
        
        document.getElementById("msg2").style.display="none"
    }
    if (password.value.length < 5 && userName.value.length < 5) {
        document.getElementById("msg2").style.display="block"
        document.getElementById("msg1").style.display="block"
    }
    
    if (userName.value.length > 5 && password.value.length > 5) {
        return true
    }else{
        return false
    }
}