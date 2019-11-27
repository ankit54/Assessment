fetch('https://jsonplaceholder.typicode.com/todos')
  .then(response => response.json()) // response variable is used to store the data fetching from database and then we are removing unwanted details of the data by calling json() method and then returning to the next line
  .then(json => console.log(json)) // receiving the data and printing it in console
  //.catch(error => console.log("error",error)) //used to handle if something went worng