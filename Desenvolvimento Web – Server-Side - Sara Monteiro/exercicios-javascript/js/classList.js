

let lis = document.querySelectorAll('li');
console.log(lis);
    
for (const element of lis) {
    if (element.classList.contains('highlight')){
        element.classList.remove('highlight');
        
    } else {
        element.classList.add('highlight');
    }
}
