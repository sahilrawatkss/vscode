const emojis = [
  "👻",
  "👻",
  "👹",
  "👹",
  "🤬",
  "🤬",
  "🤪",
  "🤪",
  "😃",
  "😃",
  "🤡",
  "🤡",
  "🤠",
  "🤠",
  "🧟‍♀️",
  "🧟‍♀️",
];

const start = document.querySelector(".start");
start.addEventListener("click", function () {
  newgame();
});

function newgame() {
  window.location.reload();
}

var shuf_emojis = emojis.sort(() => (Math.random() > 0.5 ? 2 : -1));

for (let i = 0; i < emojis.length; i++) {
  let box = document.createElement("div");
  box.className = "item";
  box.innerHTML = shuf_emojis[i];
  box.classList.add("boxOpen");
  // box.onclick = function () {
  //   this.classList.add("boxOpen");
  //   setTimeout(function () {
  //     if (document.querySelectorAll(".boxOpen").length > 1) {
  //       if (
  //         document.querySelectorAll(".boxOpen")[0].innerHTML ==
  //         document.querySelectorAll(".boxOpen")[1].innerHTML
  //       ) {
  //         document.querySelectorAll(".boxOpen")[0].classList.add("boxMatch");
  //         document.querySelectorAll(".boxOpen")[1].classList.add("boxMatch");

  //         document.querySelectorAll(".boxOpen")[1].classList.remove("boxOpen");
  //         document.querySelectorAll(".boxOpen")[0].classList.remove("boxOpen");

  //         if (document.querySelectorAll(".boxMatch").length == emojis.length) {
  //           alert("You Won");
  //         }
  //       } else {
  //         document.querySelectorAll(".boxOpen")[1].classList.remove("boxOpen");
  //         document.querySelectorAll(".boxOpen")[0].classList.remove("boxOpen");
  //       }
  //     }
  //   }, 500);
  // };

  document.querySelector(".game").appendChild(box);
}

const check = document.querySelectorAll(".item");
console.log(check);

setTimeout(function () {
  for (let i = 0; i < check.length; i++) {
    check[i].classList.remove("boxOpen");
  }
}, 4000);

for (let i = 0; i < check.length; i++) {
  check[i].addEventListener("click", function () {
    console.log("clicked");
    check[i].classList.add("boxOpen");
    setTimeout(function () {
      if (document.querySelectorAll(".boxOpen").length > 1) {
        if (
          document.querySelectorAll(".boxOpen")[0].innerHTML ==
          document.querySelectorAll(".boxOpen")[1].innerHTML
        ) {
          document.querySelectorAll(".boxOpen")[0].classList.add("boxMatch");
          document.querySelectorAll(".boxOpen")[1].classList.add("boxMatch");

          document.querySelectorAll(".boxOpen")[1].classList.remove("boxOpen");
          document.querySelectorAll(".boxOpen")[0].classList.remove("boxOpen");

          if (document.querySelectorAll(".boxMatch").length == emojis.length) {
            alert("You Won");
          }
        } else {
          document.querySelectorAll(".boxOpen")[1].classList.remove("boxOpen");
          document.querySelectorAll(".boxOpen")[0].classList.remove("boxOpen");
        }
      }
    }, 500);
  });
}
