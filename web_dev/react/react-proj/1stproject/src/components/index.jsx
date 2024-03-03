import React, { useState } from "react";
import data from "./data";
import "./style.css";

export default function Accordion() {
  const [singleSelection, enableSingleSelection] = useState(null);
  const [multiSelection, enableMultiSelection] = useState(false);
  const [multiple, setMultiple] = useState([]);

  function handleMultiSelection(id) {
    enableSingleSelection(null);
    let cpyMultiple = [...multiple];
    if (cpyMultiple.includes(id)) {
      cpyMultiple = cpyMultiple.filter((item) => id !== item);
    } else {
      cpyMultiple.push(id);
    }
    setMultiple(cpyMultiple);
  }

  function handleSingleSelection(id) {
    setMultiple([]);
    enableSingleSelection(id === singleSelection ? null : id);
  }
  return (
    <div className="wrapper">
      <button
        className="btn"
        onClick={() => enableMultiSelection(!multiSelection)}
      >
        {multiSelection ? "Disable MultiSelection" : "Enable MultiSelection"}
      </button>

      <div className="Accordian">
        {data.map((dataItem) => (
          <div
            onClick={
              multiSelection
                ? () => handleMultiSelection(dataItem.id)
                : () => handleSingleSelection(dataItem.id)
            }
            className="item"
          >
            <div className="title">
              <h3>{dataItem.question}</h3>
              <span>+</span>
            </div>
            {multiSelection ? (
              multiple.includes(dataItem.id) && (
                <div className="content">{dataItem.answer}</div>
              )
            ) : singleSelection === dataItem.id ? (
              <div className="content">{dataItem.answer}</div>
            ) : null}
          </div>
        ))}
      </div>
    </div>
  );
}
