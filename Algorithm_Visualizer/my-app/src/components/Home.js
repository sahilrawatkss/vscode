import React, { Component } from "react";
import "../styles/home.css";
import bar from "../saves/sort1.gif";
import ds from "../saves/ds1.png";

class Home extends Component {
  constructor() {
    super();
    this.state = {
      problems: [
        {
          name: "Sorting",
          imgUrl: bar,
          link: "/sortingpage",
        },
        {
          name: "Data Structures",
          imgUrl: ds,
          link: "/datastructure",
        },
      ],
    };
  }

  render() {
    return (
      <div className="back">
      <div className="back1">
        <h1 className="main-title">
          ALGORITHM
          <strong style={{ color: "var(--home-color)" }}>
            <br />
            VISUALIZER
          </strong>
        </h1>
        </div>
        <div className="imglink">
          {this.state.problems.map(element =>
            <div
              className="item"
              style={{ cursor: "pointer" }}
              onClick={() => (window.location.href = element.link)}
            >
              <div className="demo">
                <img src={element.imgUrl} alt="Card cap" height={175} width={175}/>
                  <h3 className="algo-name">{element.name}</h3>
                </div>
            </div>
          )}
        </div>
      </div>
    );
  }
}

export default Home;
