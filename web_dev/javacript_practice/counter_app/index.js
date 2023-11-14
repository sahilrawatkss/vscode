let count = 0;
const counter = document.querySelector(".counter");
const btn = document.querySelectorAll(".act");

btn.forEach((element) => {
  element.addEventListener("click", (event) => {
    const store = event.currentTarget.classList;
    if (store.contains("increase")) {
      count++;
    } else if (store.contains("decrease")) {
      count--;
    } else {
      count = 0;
    }
    counter.innerHTML = count;
    console.log(count);
  });
});

// const inc = document.querySelector(".increase");
// inc.addEventListener("click", () => {
//   count++;
//   console.log(count);
//   counter.innerHTML = count;
// });
// console.log(inc);
