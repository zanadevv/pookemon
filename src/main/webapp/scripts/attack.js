let attackButton = document.getElementById("atacar");
attackButton.addEventListener("click", function() {

    let xhttp = new XMLHttpRequest();

    let url = "http://localhost:8080/pookemon_war_exploded/Main?";

    xhttp.open("GET", url, true);

    xhttp.responseType = 'text';

    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            let hp = this.responseText;
            console.log("HP: " + hp);
        }
    };

    xhttp.send();

});
