import React from "react";

export default function hex() {
  const code = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "A", "B", "C", "D", "E", "F"];

  function findRandom() {
    return Math.floor(Math.random() * 16);
  }

  function generateHex() {
    let col = "#";
    for (let i = 0; i < 6; i++) {
      col += code[findRandom()];
    }
  }

  return <button onClick={() => generateHex()}>HEX Color</button>;
}
