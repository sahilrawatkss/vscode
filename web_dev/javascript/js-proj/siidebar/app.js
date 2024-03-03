const togglebtn = document.querySelector(".sidebar-toggle");
const sidebar = document.querySelector(".sidebar");
const cross = document.querySelector(".close-btn");

togglebtn.addEventListener("click", function () {
  sidebar.classList.toggle("show-sidebar");
  console.log(1);
});

cross.addEventListener("click", function () {
  sidebar.classList.remove("show-sidebar");
});
