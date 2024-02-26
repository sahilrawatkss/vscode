const colors = ["red", "green", "rgb(10,20,80)", "#f1508f"];
const btn = document.getElementById("btn");
const color = document.querySelector(".color");

btn.addEventListener("click", function () {
  const random = getRandom();
  console.log(random);
  document.body.style.backgroundColor = colors[random];
  color.textContent = colors[random];
});

function getRandom() {
  return Math.floor(Math.random() * 4);
}
