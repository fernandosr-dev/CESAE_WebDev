let myBtn = document.getElementById('myBtn');
let login = true;

function hello() {
    alert('cucu')
}

function goodbye() {
    alert('goodbye')
}

//myBtn.addEventListener('click', hello);
//myBtn.addEventListener('click', goodbye);

myBtn.addEventListener('click', function() {
    login ? hello() : goodbye();

    //if(login)
});