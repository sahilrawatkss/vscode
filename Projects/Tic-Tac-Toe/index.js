const App = {
  $: {
    menu: document.querySelector('[target-id="menu"]'),
    menuItems: document.querySelector('[target-id="menu-btn"]'),
    squares: document.querySelectorAll('[target-id="square"]'),
    resetBtn: document.querySelector('[target-id="reset"]'),
    newRoundBtn: document.querySelector('[target-id="newRound"]'),
    modal: document.querySelector('[target-id="modal"]'),
    modalText: document.querySelector('[target-id="modal-text"]'),
    modalBtn: document.querySelector('[target-id="modal-btn"]'),
    turn: document.querySelector('[target-id="turn"]'),
    p1Score: document.querySelector('[target-id="p1-score"]'),
    p2Score: document.querySelector('[target-id="p2-score"]'),
    ties: document.querySelector('[target-id="ties"]'),
  },

  state: {
    moves: [],
  },

  score: {
    p1Points: 0,
    p2Points: 0,
    tiePoints: 0,
  },

  reset() {
    App.state.moves = [];
    App.$.squares.forEach((square) => {
      square.replaceChildren();
    });
  },

  setScore() {
    App.$.p1Score.innerHTML = App.score.p1Points + " wins";
    App.$.p2Score.innerHTML = App.score.p2Points + " wins";
    App.$.ties.innerHTML = App.score.tiePoints;
  },

  gameStatus(moves) {
    const p1 = moves
      .filter((move) => move.playerId === 1)
      .map((move) => +move.squareId);

    const p2 = moves
      .filter((move) => move.playerId === 2)
      .map((move) => +move.squareId);

    const winningPatterns = [
      [1, 2, 3],
      [1, 5, 9],
      [1, 4, 7],
      [2, 5, 8],
      [3, 5, 7],
      [3, 6, 9],
      [4, 5, 6],
      [7, 8, 9],
    ];

    let winner = null;

    winningPatterns.forEach((pattern) => {
      // console.log({ p1, p2, pattern });
      const p1wins = pattern.every((v) => p1.includes(v));
      const p2wins = pattern.every((v) => p2.includes(v));

      if (p1wins) winner = 1;
      if (p2wins) winner = 2;
    });

    return {
      status:
        moves.length === 9 || winner != null ? "completed" : "in-progress",
      winner,
    };
  },

  init() {
    App.$.menu.addEventListener("click", (event) => {
      App.$.menuItems.classList.toggle("hidden");
    });

    App.$.resetBtn.addEventListener("click", (event) => {
      App.reset();
    });

    App.$.newRoundBtn.addEventListener("click", (event) => {
      App.reset();
      App.score.p1Points = 0;
      App.score.p2Points = 0;
      App.score.tiePoints = 0;
      App.setScore();
    });

    App.$.modalBtn.addEventListener("click", (event) => {
      App.reset();
      App.$.modal.classList.add("hidden");
    });

    App.$.squares.forEach((square) => {
      square.addEventListener("click", () => {
        // const hasMove = (squareId) => {
        //   const existMove = App.state.moves.find((move) => {
        //     move.squareId === squareId;
        //   });
        //   return existMove !== undefined;
        // };

        // if (hasMove(squareId)) {
        //   return;
        // }

        if (square.hasChildNodes()) {
          return;
        }
        function lastPlayer(player) {
          return player === 1 ? 2 : 1;
        }

        const currentPlayer =
          App.state.moves.length === 0
            ? 1
            : lastPlayer(App.state.moves.at(-1).playerId);
        const icon = document.createElement("i");

        const nextPlayer = lastPlayer(currentPlayer);
        const turnIcon = document.createElement("i");
        const turnText = document.createElement("p");

        if (nextPlayer === 1) {
          turnIcon.classList.add("fa-solid", "fa-x", "turquoise");
        } else {
          turnIcon.classList.add("fa-solid", "fa-o", "yellow");
        }

        turnText.innerHTML = `Player ${nextPlayer}, you ar up`;

        App.$.turn.replaceChildren(turnIcon, turnText);

        if (currentPlayer === 1) {
          icon.classList.add("fa-solid", "fa-x", "turquoise");
        } else {
          icon.classList.add("fa-solid", "fa-o", "yellow");
        }

        App.state.moves.push({
          squareId: +square.id,
          playerId: currentPlayer,
        });

        // currentPlayer = currentPlayer === 1 ? 2 : 1;
        square.replaceChildren(icon);

        // console.log(`square ${event.target.id} clicked `);

        const game = App.gameStatus(App.state.moves);
        // console.log(game);

        if (game.status === "completed") {
          let win = "";
          if (game.winner) {
            win = `player ${game.winner} wins`;

            if (game.winner === 1) {
              App.score.p1Points++;
            } else {
              App.score.p2Points++;
            }
          } else {
            win = "Tie Game";
            App.score.tiePoints++;
          }
          App.$.modalText.innerHTML = win;

          App.setScore();

          App.$.modal.classList.remove("hidden");
        }
      });
    });
  },
};

window.addEventListener("load", App.init);
