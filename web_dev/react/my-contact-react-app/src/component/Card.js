import React from "react";
import Avatar from "./Avatar";
import Detail from "./Detail";

function Card(props) {
  return (
    <div className="card">
      <div className="top">
      {/* <p className="key">{props.id}</p> */}
      <p className="contact-name">{props.name}</p>
      <Avatar src={props.src}/>
      </div>
      <div className="bottom">
      <Detail cardinfo={props.contact}/>
      <Detail cardinfo={props.email}/>
      </div>
    </div>
  );
}

export default Card;
