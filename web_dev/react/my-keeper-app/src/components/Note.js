import React from "react";

function Note(prop) {
    return(
        <div className="note">
            <h1 className="title">{prop.title}</h1>
            <p className="content">{prop.content}</p>
        </div>
    );
}

export default Note;