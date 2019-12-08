$(document).ready(function(){
    $("#showLogin").click(function(){
      $("#register").hide();
    });
    $("#showLogin").click(function(){
      $("#imagesDiv").hide();
    });
    $("#showLogin").click(function(){
      $("#login").show();
    });
  });
  $(document).ready(function(){
    $("#showRegister").click(function(){
      $("#login").hide();
    });
    $("#showRegister").click(function(){
      $("#imagesDiv").hide();
    });
    $("#showRegister").click(function(){
      $("#register").show();
    });
  });
  $(document).ready(function(){
    $("#showImages").click(function(){
      $("#login").hide();
    });
    $("#showImages").click(function(){
      $("#register").hide();
    });
    $("#showImages").click(function(){
      $("#imagesDiv").show();
    });
  });

  function ValidateEmail(inputText)
  {
  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if(inputText.value.match(mailformat))
  {
  return true;
  }
  else
  {
  alert("You have entered an invalid email address!");
  return false;
  }
  }
   
  function validatePassword(inputText)
  {
  var passwordFormat = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
  if(inputText.value.match(passwordFormat))
  {
  return true;
  }
  else
  {
  alert("Password must conatin 1 Uppercase,1 lowercase,1 number and 1 special character");
  return false;
  }
  }
  function validatePhone(inputtxt)
    {
  var phoneno = /^\d{10}$/;
  if(inputtxt.value.match(phoneno))
  {
      return true;
  }
  else
  {
     alert("Not a valid Phone Number");
     return false;
  }
  }


window.onload=init;

function fun(){
    var user = {
        name:document.getElementById("inputName").value,
        email:document.getElementById("inputEmail3").value,
        phone:document.getElementById("inputPhone").value,
        password:document.getElementById("inputPassword1").value
    };

    if(user.name!=="" && user.email!==""){
        userArray=JSON.parse(localStorage.getItem("user")) || [];
        userArray.push(user);
        localStorage.setItem("user",JSON.stringify(userArray));
        userArray=localStorage.getItem("user");
        userArray=JSON.parse(userArray);
    }
    document.getElementById("registeredMsg").innerHTML="your are registered!";
    console.log(userArray);
    setTimeout(function(){
        window.location.href = 'http://127.0.0.1:5500/Question_3/index.html';
     }, 1500);
}
function init(){
    var userArray=[];
}

function fun2(){
    console.log(userArray);
}
