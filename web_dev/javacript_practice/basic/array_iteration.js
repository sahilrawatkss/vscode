const arr = [45, 4, 9, 16, 25];

// arr.forEach(myFunction);

// function myFunction(val, index) {
//   console.log(val + " " + index);
// }

const arr2 = arr.map((val) => {
  return val * 2;
});

const flatarr2 = arr.flatMap((val) => {
  return val * 2;
});

console.log(arr2);
console.log(flatarr2);
