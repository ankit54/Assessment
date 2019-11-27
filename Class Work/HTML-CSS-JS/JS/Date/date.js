var d=new Date()
console.log(d)

// var d1=new Date(0)
// console.log(d1)

// var d2= new Date("October 30")
// console.log(d2)

// var d3=new Date()
// console.log(d3.getHours())

console.log("======================")
var  year=d.getFullYear()
//console.log("year= "+year);

var month=d.getMonth();
//console.log("month= "+month);

var date=d.getDate();
//console.log("date= "+date)
var day=d.getDay();

var months=["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]
var thisMonth=months[month]

var days=["Sun","Mon","Tue","Wed","Thu","Fri","Sat"]
var thisDay=days[day]

console.log(thisMonth)
console.log(thisDay)


