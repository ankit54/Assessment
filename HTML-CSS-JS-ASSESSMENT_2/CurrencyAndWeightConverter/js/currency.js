function convertCurrency(){
    var from =document.getElementById("from").value;
    var to=document.getElementById("to").value;
    var xmlhttp=new XMLHttpRequest();
    var url="http://data.fixer.io/api/latest?access_key=fe8905bcb081c178e5d43313e910722b&"+from+"&"+to;

xmlhttp.open("GET",url,true); // open connection 
xmlhttp.send(); //send the request
xmlhttp.onreadystatechange = function(){
    if(xmlhttp.readyState == 4 && xmlhttp.status==200){
        var result= xmlhttp.responseText; //give jSON result
        var jsResult= JSON.parse(result);
        var oneUnit=jsResult.rates[to]/jsResult.rates[from] //calculating 1 unit of a currency = x unit of another currency
        var amt = document.getElementById("fromAmount").value;
        document.getElementById("toAmount").value= (oneUnit*amt).toFixed(2); 
    }
}
}