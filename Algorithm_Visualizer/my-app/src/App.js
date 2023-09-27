import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './components/Home';
import Sorting from './SortingVisualiizer/sortingpage';

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="sortingpage" element={<Sorting/>}/>
        </Routes>
        <Routes>
          <Route path="/" element={<Home />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
