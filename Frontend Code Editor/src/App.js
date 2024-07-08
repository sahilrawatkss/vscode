import "./App.css";

import Home from "./components/Home.jsx";
import DataProvider from "./context/DataProvider";

function App() {
  return (
    <DataProvider>
      <Home />
    </DataProvider>
  );
}

export default App;
