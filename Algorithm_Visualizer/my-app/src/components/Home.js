import React from "react";
import { Link } from "react-router-dom";
import "../styles/home.css";
import bar from "../saves/sort1.gif";
import ds from "../saves/ds1.png";

function Home() {
  const problems = [
    {
      name: "Sorting",
      imgUrl: bar,
      link: "/sortingpage",
    },
    {
      name: "Data Structures",
      imgUrl: ds,
      link: "/datastructure", // Add a corresponding route in App.js if needed
    },
  ];

  return (
    <div className="back">
      <div className="back1">
        <h1 className="main-title">
            ALGORITHM
            <br />
            VISUALIZER
        </h1>
      </div>
      <div className="imglink">
        {problems.map((element, index) => (
          <Link to={element.link} key={index} className="item">
            <div className="demo">
              <img src={element.imgUrl} alt="Card cap" height={175} width={175} />
              <h3 className="algo-name">{element.name}</h3>
            </div>
          </Link>
        ))}
      </div>
    </div>
  );
}

export default Home;
