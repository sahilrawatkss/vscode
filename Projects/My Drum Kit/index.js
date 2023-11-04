let slength = document.querySelectorAll(".drum").length;
for (var i = 0; i < slength; i++) {
  document.querySelectorAll(".drum")[i].addEventListener("click", function () {
    let tom1 = new Audio("sounds/tom-2.mp3");
    tom1.play();
  });
}
