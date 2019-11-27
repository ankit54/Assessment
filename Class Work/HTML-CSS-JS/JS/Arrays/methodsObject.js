var items=[{
    name:"lipstick",
    id:1,
    price:499
    },
    {
        name:"eyeliner",
        id:2,
        price:999 
    },
    {
        name:"watch",
        id:3,
        price:10000
    },
    {
        name:"trimmer",
        id:4,
        price:1999
    }   
]

console.info("%c=========after Filter using arrow function========","color:green")
var filteredItems=items.filter(item=>item.price>500)
console.log("Filtered items= ",filteredItems)



console.info("%c=========after Map using arrow function========","color:green")
var mappedItems=items.map((item)=>{
    var x={
        name:item.name,
        id:item.id,
        price:item.price + 0.1*item.price
    }
    
    return x
})
console.log("Mapped items= ",mappedItems)