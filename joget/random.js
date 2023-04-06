document.addEventListener('DOMContentLoaded', function(){
    document.querySelector('button').onclick = count;
});

function count() {
    var arr = [];
    for (var i = 0; i < 10; i++) {
        arr.push(Math.round(Math.random() * 1000 + 1));
    }
    console.log(arr);

    let sum = arr.reduce(function(a, b){
        return a + b;
    });
    console.log(sum);
}

