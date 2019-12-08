
jsResult={
     g : 1000,
     kg : 1,
     ounce : 35.274,
     lb : 2.20462,
     t : 0.00110231,
     mg: 0.0000001
};

function convertWeight(){
    var from =document.getElementById("fromW").value;
    var to=document.getElementById("toW").value;
    var oneUnit=jsResult[to]/jsResult[from]//calculating 1 unit of a currency = x unit of another currency
    var amt = document.getElementById("fromWeight").value;
    document.getElementById("toWeight").value= (oneUnit*amt).toFixed(6); 
}