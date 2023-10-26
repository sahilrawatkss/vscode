import React from "react";
import Header from "./components/Header";
import Footer from "./components/Footer";
import Note from "./components/Note";
import notes from "./components/Note-store";

// function createNote(notes) {
//   return (
//     <Note
//     key={notes.key}
//     title={notes.title}
//     content={notes.content}/>
//   );
// }

function App() {
  return (<div>
  <Header/>
  {/* <Note 
    title="Note Heading"
    content="Write Content here"
  /> */}
  {notes.map(notes=>
    <Note
    key={notes.key}
    title={notes.title}
    content={notes.content}/>
    )}
  <Footer/>
  </div>);
}
export default App; 