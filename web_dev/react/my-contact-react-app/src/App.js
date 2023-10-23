import React from "react";
import Card from "./component/Card";
import contacts from "./component/contact";
function App() {
  return (
    <div className="main">
    <h1 className="heading">My Contacts</h1>
      <Card
      name={contacts[0].name}
      src={contacts[0].src}
      contact={contacts[0].contact}
      email={contacts[0].email}
      />
      <Card
      name={contacts[1].name}
      src={contacts[1].src}
      contact={contacts[1].contact}
      email={contacts[1].email}
      />
      <Card
      name={contacts[2].name}
      src={contacts[2].src}
      contact={contacts[2].contact}
      email={contacts[2].email}
      />
    </div>
  );
}

export default App;
