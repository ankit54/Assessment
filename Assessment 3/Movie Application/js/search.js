function getdata(){

    mov=document.getElementById("search").value;
    console.log(mov)
    tsr=""
    fetch("http://www.omdbapi.com/?s="+mov+"&apikey=fbab3361")
    .then(response => response.json())
    .then(json =>{

        movie=json
        console.log(movie.Search )
        for(x in movie.Search){
            console.log(movie.Search[x].Title);
            tsr=tsr+"<img src='"+movie.Search[x].Poster+"' class='card-img-top' alt='img'>"+
            "<div class='card-body' style='height=10rem;'>"+
            "<h5 class='card-title'>"+movie.Search[x].Title+"</h5>"+
            "<h5 class='card-title'>"+movie.Search[x].Year+", "+movie.Search[x].imdbID+"</h5>"+
            "<a href='#' class='btn btn-success'>Click To Watch</a></div><hr>"
            document.getElementById("displayCard").innerHTML=tsr
        }
    })
    .catch(err=>console.log(err))

}