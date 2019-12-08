var count=0; // to count no.of times button clicked.
var arr=['red','yellow','green','blue','grey','brown']
			
function run() { 
    if (count<6) {
        document.body.style.background = arr[count]; 
    }else{
        count=0;
        document.body.style.background = arr[count];
    }
	count=count+1;
}		