const animals = ['dog', 'pikachu', 'megoladon', 'rasberry crazy ant', 'aardvark', 'cat'];

// const animalsNew = animals.filter((val) => {
//     return val.length <= 8;
// }).map((val, i, arr) => {
//     if (i < arr.length-1) {
//         return val + ", ";
//     } else {
//         return val;
//     }
// }).reduce((prev, val) => {
//     return prev + val;
// }, 'Animals: ')

const animalsNew = animals
.filter(value => value.length <= 8)
.map((val, i) => i ? ', ' + val : val) //Checks if index = truthy (!0), adds ", " before each value not at the start e.g ", pikachu"
.reduce((prev,val) => prev + val, 'Animals: ');


const header = document.getElementById("header");
header.append(animalsNew);
console.log(animalsNew);