import React from "react";
import Avatar from "./Avatar";

function Card(props) {
  return (
    <div className="card">
      <div className="top">
      <p className="contact-name">{props.name}</p>
      <Avatar src={props.src}/>
      </div>
      <div className="bottom">
      <p className="number">{props.contact}</p>
      <p className="email">{props.email}</p>
      </div>
    </div>
  );
}

export default Card;
