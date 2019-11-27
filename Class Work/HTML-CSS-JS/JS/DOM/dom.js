var pElement=document.getElementById("demo")
console.log(pElement)
console.log(pElement.textContent="Good Evening")
console.log(document.querySelector("#demo").textContent)


var elements=(document.getElementsByClassName("div1"))
console.log("Elements: ",elements)
elements[0].style.color="red"

var cElement=document.createElement("button")
cElement.textContent="Click Me"
document.body.appendChild(cElement)

var p=document.createElement("p")
p.textContent="i am child para tag"
document.body.appendChild(p)

document.write("i want to sleep")

var h=document.createElement("h1")
h.textContent="i want to sleep"
document.body.appendChild(h)



var ele=document.getElementById("add")
// ele.className="xyz"
ele.classList="xyz abc"



// var ul=document.createElement("ul")
// ul.textContent="List of Cars!!"
// var li1=document.createElement("li")
// var li2=document.createElement("li")
// var li3=document.createElement("li")
// li1.textContent="BMW"
// li2.textContent="Ford"
// li3.textContent="Jaquar"
// ul.appendChild(li1)
// ul.appendChild(li2)
// ul.appendChild(li3)
// document.body.appendChild(ul)


var list= `<ul>
                <li>BMW</li>
                <li>Ford</li>
                <li>Jaquar</li>
           </ul>`
var divele=document.getElementById("addlist")
divele.innerHTML=list