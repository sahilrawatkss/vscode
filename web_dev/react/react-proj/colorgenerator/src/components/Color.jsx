import React, { useState } from "react";
import "./style.css";
// import hex from "./hex";

export default function Color() {
  const code = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, "A", "B", "C", "D", "E", "F"];
  const [colorCode, setColorCode] = useState("#fff");
  const [type, setType] = useState("hex");

  function rgbCode(value) {
    return Math.floor(Math.random() * value);
  }

  function findRandom() {
    return Math.floor(Math.random() * 16);
  }

  function generateHex() {
    let col = "#";
    for (let i = 0; i < 6; i++) {
      col += code[findRandom()];
    }
    setColorCode(col);
  }

  function generateRGB() {
    let red = rgbCode(256);
    let green = rgbCode(256);
    let blue = rgbCode(256);
    setColorCode(`rgb(${red},${green},${blue})`);
  }

  return (
    <div className="container" style={{ backgroundColor: colorCode }}>
      <div className="btns">
        <button onClick={() => setType("hex")}>HEX Color</button>
        <button onClick={() => setType("rgb")}>RGB Color</button>
        <button
          onClick={type === "hex" ? () => generateHex() : () => generateRGB()}
        >
          Generate Random Color
        </button>
      </div>
      <h1 className="heading">{type === "hex" ? "HEX" : "RGB"}</h1>
      <div className="display">{colorCode}</div>
    </div>
  );
}
