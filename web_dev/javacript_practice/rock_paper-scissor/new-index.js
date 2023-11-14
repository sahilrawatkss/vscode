const compChoice = ["rock", "paper", "scissors"];
const playerChoice = document.querySelectorAll(".btn");
const playerChoose = document.querySelector(".player-choose");
const compChoose = document.querySelector(".comp-choose");
const playerWins = document.querySelector(".player-score");
const compWins = document.querySelector(".comp-score");
const showWinner = document.querySelector(".sub-heading");
const gameOverContainer = document.querySelector(".game-over-container");
const newGame = document.querySelector(".new-game");
const winner = document.querySelector(".winner");

let compScore = 0;
let playerScore = 0;

playerChoice.forEach((element) => {
  element.addEventListener("click", (event) => {
    const playerOpt = event.currentTarget.classList;
    const index = Math.floor(Math.random() * 3);
    const compOpt = compChoice[index];

    showChoices(playerOpt, compOpt);
    if (
      (playerOpt.contains("rock") && compOpt == "scissors") ||
      (playerOpt.contains("paper") && compOpt == "rock") ||
      (playerOpt.contains("scissors") && compOpt == "paper")
    ) {
      playerScore++;
      showWinner.innerHTML = "Player Wins!";
    } else if (
      (playerOpt.contains("rock") && compOpt == "paper") ||
      (playerOpt.contains("paper") && compOpt == "scissors") ||
      (playerOpt.contains("scissors") && compOpt == "rock")
    ) {
      compScore++;
      showWinner.innerHTML = "Computer Wins!";
    } else {
      showWinner.innerHTML = "It's a tie!";
    }
    playerWins.innerHTML = "Player : " + playerScore;
    compWins.innerHTML = "Computer : " + compScore;

    if (playerScore == 5 || compScore == 5) {
      playerScore === 5
        ? (winner.textContent = "You Won!")
        : (winner.textContent = "Computer Won");
      gameOverContainer.classList.toggle("hidden");
    }
  });
});

showChoices = (playerOpt, compOpt) => {
  if (playerOpt.contains("rock")) {
    playerChoose.textContent = "✊";
  } else if (playerOpt.contains("paper")) {
    playerChoose.textContent = "✋";
  } else {
    playerChoose.textContent = "✌";
  }

  switch (compOpt) {
    case "rock":
      compChoose.textContent = "✊";
      break;
    case "paper":
      compChoose.textContent = "✋";
      break;
    case "scissors":
      compChoose.textContent = "✌";
      break;
  }
};

newGame.addEventListener("click", () => {
  playerScore = 0;
  compScore = 0;
  showWinner.innerHTML = "Choose Your Weapon!";
  playerChoose.textContent = "❔";
  compChoose.textContent = "❔";
  playerWins.innerHTML = "Player : 0";
  compWins.innerHTML = "Computer : 0";
  gameOverContainer.classList.toggle("hidden");
});
