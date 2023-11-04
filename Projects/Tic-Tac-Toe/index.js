const App = {
  $: {
    menu: document.querySelector('[target-id="menu"]'),
    menuItems: document.querySelector('[target-id="menu-btn"]'),
    squares: document.querySelectorAll('[target-id="square"]'),
    resetBtn: document.querySelector('[target-id="reset"]'),
    newRoundBtn: document.querySelector('[target-id="newRound"]'),
  },

  init() {
    App.$.menu.addEventListener("click", (event) => {
      App.$.menuItems.classList.toggle("hidden");
    });

    App.$.resetBtn.addEventListener("click", (event) => {
      console.log("reset game");
    });

    App.$.newRoundBtn.addEventListener("click", (event) => {
      console.log("new game");
    });
    console.log(squares);
    App.$.squares.forEach((square) => {
      square.addEventListener("click", () => {
        console.log(square);
        console.log(square);
        // console.log(`square ${event.target.id} clicked `);
        const icon = document.createElement("i");
        icon.classList.add("fa-solid", "fa-x", "turquoise");
        square.replaceChildren(icon);
      });
    });
  },
};

window.addEventListener("load", App.init);
