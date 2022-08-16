let searchBook = {
    fetchBook: function(book){
        console.log("In");
        fetch('books.json').then((response) => {
        if (!response.ok) {
          alert("No book found.");
          throw new Error("No Data Found.");
        }
        return response.json();
      })
      .then((data) => this.displayBook(data, book))
    },

    fetchDetails: function(key){
        fetch('https://openlibrary.org'+key+'.json').then((response) => {
            if (!response.ok) {
              alert("No API found.");
              throw new Error("No Data Found.");
            }
            return response.json();
          })
          .then((data) => this.getdescription(data))
        },

        getdescription: function(data){
            const des = data.description;
            return(des);
        },
        
    displayBook: function(data, book){
    const books = data.entries;
    const n = books.length;
    
    var dynamic = document.querySelector('.books-wrapper .table');

    for (var i =0;i<6;i++){
        var fetch = document.querySelector('.books-wrapper .table').innerHTML;
        const title = books[i].title;
        var inc = i + 1;
        var pic = "cover"+inc+".jpg";
        const description = books[i].description;
        dynamic.innerHTML = fetch +  `<tr>
        <td>${title}</td>
        <td><img src=${pic}></td>
        <td><a href="#" class="fa fa-heart"></a></td>
        </tr>`;
    }
    },
            search: function(){
                console.log("in");
                this.fetchBook(document.querySelector(".search-bar").value)
            }
    }

    //document.querySelector(".fa fa-search").addEventListener("click",function(){searchBook.search()})
    searchBook.fetchBook("Future");

    

