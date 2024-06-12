import Slider from "./components/image-slider/slider";
function App() {
  function getRandom() {
    return `${Math.floor(Math.random() * 50 + 1)}`;
  }

  return (
    <div className="App">
      <Slider
        url={"https://picsum.photos/v2/list"}
        limit={"10"}
        page={getRandom()}
      />
    </div>
  );
}

export default App;
