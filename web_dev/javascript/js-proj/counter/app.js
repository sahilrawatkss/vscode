const counter = document.querySelector(".countvalue");
let count = 0;
const dec = document.getElementById("dec");
const reset = document.getElementById("reset");
const inc = document.getElementById("inc");

dec.addEventListener("click", function () {
  decrease();
});

reset.addEventListener("click", function () {
  zero();
});

inc.addEventListener("click", function () {
  increase();
});

function decrease() {
  count--;
  counter.textContent = count;
}

function zero() {
  count = 0;
  counter.textContent = count;
}

function increase() {
  count++;
  counter.textContent = count;
}
