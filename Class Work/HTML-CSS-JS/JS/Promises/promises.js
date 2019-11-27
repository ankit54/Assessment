const promise=new Promise(function(resolve,reject) {
    if (20>10) {
        var person=[
            {
                name:"ankit",
                age:23
            },
            {
                name:"ankita",
                age:25
            }
        ]
        resolve(person    )
    } else {
        reject("no data")
    }
})
promise.then(function (data) {
    //console.log("Data ",data)
    return data[0]
}).then(function (data) {
    console.log("Data ",data) 
}).catch(function (error) {
    console.log("Error ",error)
})