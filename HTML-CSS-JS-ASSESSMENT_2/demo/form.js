var userArray=[];
// window.onload=init;

function fun(){
    var user = {
        name:document.getElementById("full-name").value,
        email:document.getElementById("email").value
    };

    if(user.name!=="" && user.email!==""){
        userArray=JSON.parse(localStorage.getItem("user")) || [];
        userArray.push(user);
        localStorage.setItem("user",JSON.stringify(userArray));
        userArray=localStorage.getItem("user");
        userArray=JSON.parse(userArray);
    }
    document.getElementById("msg").innerHTML="your are registered!";
    setTimeout(function(){
        window.location.href = 'www.google.com';
     }, 1500);
}
