import React , {useState , useRef} from "react";
import "../styles/sidebar.css";
import { Link } from "react-router-dom";

export default function Sidebar(props) {

  const activeId = useRef('home');
  const [active, setActive] = useState(activeId.current);
  const handleActive = (event) => {
    let selectedId;
    if(event.target.parentNode.tagName === "LI"){
      selectedId = event.target.parentNode.id;
    }else{
      selectedId = event.target.parentNode.parentNode.id;
    }
    activeId.current = selectedId;
    setActive(activeId.current);
  }
  const handleClick = (event) => {
    handleActive(event);
    props.setPage(activeId.current);
  };

  return (
    <div>
      <nav className="sidebar">
        <div className="sidebar-content">
          <div className="top-content">
            <div className="side-heading">Home</div>
            <div className="content home-button">
              <Link to="/"><li onClick={handleClick} id="home" className={`nav-link ${active === 'home' ? 'active':''}`}>
                <button>
                  <i undefined="true" className="bx bx-home-alt-2 icon"></i>
                  <span className="text nav-text">Home</span>
                </button>
              </li></Link>
            </div>

            <div className="side-heading">Sorting Algorithms</div>
            <ul className="sorting-algorithms content">
            <Link to="/sort"><li onClick={handleClick} id="bubble-sort" className={`nav-link ${active === 'bubble-sort' ? 'active':''}`}>
                <button>
                  <i undefined="true" className="bx bx-chevron-right icon"></i>
                  <span className="text nav-text">Bubble Sort</span>
                </button>
              </li></Link>
              <Link to="/sort"><li  onClick={handleClick} id="insertion-sort" className={`nav-link ${active === 'insertion-sort' ? 'active':''}`}>
                <button>
                  <i undefined="true" className="bx bx-chevron-right icon"></i>
                  <span className="text nav-text">Insertion Sort</span>
                </button>
              </li></Link>
              <Link to="/sort"><li onClick={handleClick} id="merge-sort" className={`nav-link ${active === 'merge-sort' ? 'active':''}`}>
                <button>
                  <i undefined="true" className="bx bx-chevron-right icon"></i>
                  <span className="text nav-text">Merge Sort</span>
                </button>
              </li></Link>
              <Link to="/sort"><li onClick={handleClick} id="selection-sort" className={`nav-link ${active === 'selection-sort' ? 'active':''}`}>
                <button>
                  <i undefined="true" className="bx bx-chevron-right icon"></i>
                  <span className="text nav-text">Selection Sort</span>
                </button>
              </li></Link>
            </ul>
          </div>
        </div>
      </nav>
    </div>
  );
}