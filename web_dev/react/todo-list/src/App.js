import React, { useState } from "react";

function App() {
    const[input,setInput]=useState("");
    function getInput(event) {
        const inputData=event.target.value;
        setInput(inputData);
    }
    const[items,setItems]=useState([]);
    function getItems() {
        setItems(prevValue=>{
            return [...prevValue,input];
        });
        setInput("");
    }

    return(
        <div className="container">
            <div className="heading">
                <h1>To-Do List</h1>
            </div>
                <div className="form">
                    <input onChange={getInput} type="text" value={input}></input>
                    <button onClick={getItems}>
                        Add
                    </button>
                    <ul>
                        {items.map(res => {
                            return <li>{res}</li>;
                        })}
                    </ul>
                </div>
        </div>
    );
}

export default App;