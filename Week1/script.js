searchForm = document.querySelector('.search-form');

document.querySelector('#search-btn').onclick = () =>{
    searchForm.classList.toggle('active');
}

let getFeaturedBook = {

    fetchTitle: function(){
        fetch('author.json').then((response) => {
            if (!response.ok) {
              alert("No weather found.");
              throw new Error("No Data Found.");
            }
            return response.json();
          })
          .then((data) => this.displayTitle(data));
        },

        displayTitle: function(data){
            var names = data.docs;
            var n = names.length;

            

            var dynamic = document.querySelector('.featured-wrapper');

            for(var i =0; i<4;i++){
                var fetch = document.querySelector('.featured-wrapper').innerHTML;  
                var book =  names[i].top_work;
                var author = names[i].name;
                var img = "book-"+(i+1)+".png";
                dynamic.innerHTML =  `<div class="box">
                <div class="content">
                    <img src=${img}>
                    <h3 class="book-name">${book}</h3>
                    <div class="author">${author}</div>
                </div>
            </div> ` + fetch;
            }
    
        }

}

getFeaturedBook.fetchTitle();