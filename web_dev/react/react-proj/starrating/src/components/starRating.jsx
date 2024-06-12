import React, { useState } from "react";
import { FaStar } from "react-icons/fa";
import "./styles.css";

export default function StarRating({ numberOfStars = 5 }) {
  const [rating, setRating] = useState(0);
  const [hover, setHover] = useState(0);

  function handeClick(stars) {
    setRating(stars);
  }
  function handleMouseMove(stars) {
    setHover(stars);
    // console.log(stars);
  }
  function handleMouseLeave(stars) {
    setHover(rating);
  }
  return (
    <div className="stars">
      {[...Array(numberOfStars)].map((_, index) => {
        index += 1;
        return (
          <FaStar
            key={index}
            className={index <= (hover || rating) ? "on" : "off"}
            onClick={() => handeClick(index)}
            onMouseMove={() => handleMouseMove(index)}
            onMouseLeave={() => handleMouseLeave(index)}
            size={40}
          />
        );
      })}
    </div>
  );
}
