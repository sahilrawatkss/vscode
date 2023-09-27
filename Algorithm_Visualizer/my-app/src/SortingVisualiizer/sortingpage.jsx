import { useState, useEffect, useRef, forwardRef, useImperativeHandle } from 'react'

import '../styles/sortingpage.css'

// * Sorting Algorithm imports
import { insertionSort, insertionBubbleAnim} from './InsertionSort'
import bubbleSort from './BubbleSort'
import { selectionSort, selectionAnim } from './SelectionSort'
import MergeSort from './MergeSort'
import QuickSort from './QuickSort'

// * utility functions
const randomInterval = (min = 5, max = 600) => {
  return Math.floor(Math.random() * (max - min) + min);
};

// The random numbers have to have at least 10 values.
export function fillArray(size = 20) {
  const arr = [];

  for (let i = 0; i < size; i++) {
    arr.push(randomInterval());
  }
  return arr;
}
// import sleep from './utils/functions/sleep'
export function   sleepMain(ms) {

  return new Promise(resolve => setTimeout(resolve, ms));
}

const Node = (props) => {

  useEffect(() => {
    // console.log("Node change")
  })

    return (
      <div
        className="node"

        style={{
          height: props.height,
          background: `${props.sorted ? '#5bc9b1' : '#5bc9b1'}`,
          transitionDuration: '20ms',
          textAlign: 'center',
        }}
        >
      </div>
    )
  
}


const SorterWrapper = (props) => {
  
  const [speed, setSpeed] = useState(500);
  const [size, setSize] = useState(20)
  const [arr, setArr] = useState([...fillArray(size)]);
  const [sorted, setSorted] = useState(false);

  // * Color names for each theme:
  // *** Default/Unsorted -- Blue
  // *** Loop -- Pink
  // *** Target -- Orange
  // *** Special target -- Red
  // *** Loop Swap -- Orange
  // *** Special Swap -- Red
  const colors = {
    default: "#5bc9b1",
    curr: "lightpink",
    comparison: "coral"
  };

  // * Utility functions
  const resetSorter = () => {
    // setArr([...fillArray(length)])

    setArr([...fillArray(size)])
    setSpeed(speed)


    if (sorted) {
      setSorted(false)
    }
  };
  
  // * Event handlers
  const changeSize = (e) => {
    let tempSize = e.target.value

    setSize(tempSize)
    sorted ? resetSorter(tempSize, speed) : setArr([...fillArray(tempSize)])
  }

  const changeSpeed = (e) => {
    let speed = e.target.value
    
    sorted ? resetSorter(arr.length, speed) : setSpeed(speed)

  }

  // * Main sorting visualizer function

  // * ---------------------------
  const basicSort = async (algorithm, speed) => {

    let isSelection = false
    let isAdvanced = false

    switch (algorithm) {
      case "insertion":
        algorithm = insertionSort
        break
      case "bubble":
        algorithm = bubbleSort
        break
      case "selection":
        algorithm = selectionSort
        isSelection = true
        break
      case "merge":
        algorithm = new MergeSort()
        isAdvanced = true
        break
      case "quick":
        algorithm = new QuickSort()
        isAdvanced = true
        break
    }

    const result = isAdvanced ? algorithm.getResult(arr) : algorithm(arr)

    const steps = result.steps
    
    // console.log("STEPS: ", steps)

    const nodes = document.getElementsByClassName('node')

    if (!isSelection && !isAdvanced) {
      // * Insertion / Bubble Sort Visual
      // **********************
      await insertionBubbleAnim(steps, speed, nodes, colors)
      // **********************
    }
    else if (isAdvanced) {
      await algorithm.getAnimation(speed, nodes, colors, setArr)
    }
    else {
      // * Selection Sort Visual
      await selectionAnim(steps, speed, nodes, colors)
    }
    
    setArr([...result.sortedArray])
    setSorted(true)

  }
// * ---------------------------

  const nodeArr = arr.map((num, index) => {
    
    return <Node 
    key={index}
    num={num}
    height={num}
    sorted={sorted}
    />
  })


  return (
    <>

      <div className='wrapper'>

        <main>
        {/* Show the name of the current algorithm here... */}
          <h1>Sorting Visualizer</h1>
          <div 
              className="sorter-container"
              style={{
                gridTemplateColumns: `repeat(${arr.length}, 1fr)`,
                
              }}>
              {nodeArr}
          </div>

        </main>
        
        
        <aside className='sidenav'>

          <div className='input-container'>
            <label htmlFor="size-input">Size: </label>
            <input 
              className="input size-input slider"
              onChange={changeSize}
              name='size-input'
              type="range"
              min="10"
              value={size}
              max="100"
              step="10"
            />
          </div>

          <div className='input-container'>
            <label htmlFor='speed-input'>Speed: </label>
            <input 
              className="input speed-input slider"
              onChange={changeSpeed}
              placeholder='Min: 10ms, Max: 1000ms'
              name="speed-input"
              type='range'
              min='10'
              value={speed}
              max='310'
              step="20"
            />
          </div>
          
          <div className='btns-algo-container'>
            <button className='btn-algo' onClick={() => basicSort("insertion", speed)}>Insertion Sort</button>
            <button className='btn-algo' onClick={() => basicSort("bubble", speed)}>Bubble Sort</button>
            <button className='btn-algo' onClick={() => basicSort("selection", speed)}>Selection Sort</button>

            <button className='btn-algo' onClick={() => basicSort("merge", speed)}>Merge Sort</button>
            <button className='btn-algo' onClick={() => basicSort("quick", speed)}>Quick Sort</button>
          </div>
          
          <div>
            <button className="btn btn-reset" onClick={() => resetSorter()}>Reset</button>
          </div>
        </aside>
        

      </div>
      


    </>
  )
  
}


function App() {


  return (
    <>
        <SorterWrapper />
    </>
  )
}


export default App