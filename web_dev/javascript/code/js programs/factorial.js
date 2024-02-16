let num = 5;

function fact(num) {
  if (num === 1) {
    return 1;
  } else {
    return num * fact(num - 1);
  }
}

console.log(fact(num));
let str = "Raman";
console.log(`Hello ${str}!`);
