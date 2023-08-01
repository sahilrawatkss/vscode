import React, { Component } from "react";
import "../styles/home.css"
import bar from "../saves/bar-chart.svg";
class Home extends Component{
    constructor(){
        super();
        this.state={
            problems:[
                {
                    name:"Sorting",
                    imgUrl:bar,
                    link:"/sortingpage"
                }
            ]
        }
    }
    // componentDidMount(){
        
    //   window.particlesJS("particles-js",particleJSON );
      
    // }
    render(){
        return(
            <div className="back">
                <div id="particles-js"></div>
              
                    
                <h1 className="main-title center">
                            {/* <div className="logo">
                            <LogoIcon/>
                            </div> */}
                            ALGORITHM <strong style={{color:"var(--home-color)"}}><br></br>VISUALIZER</strong>
                </h1>
                <ul class="list-inline mt-5" style={{display:"block",position:"relative"}}>
                    {this.state.problems.map(element=>
                        <li className="list-inline-item ml-5 mr-5 mb-2" style={{cursor:"pointer"}} onClick={()=>window.location.href=element.link}>
                        <div className="card" style={{width: "14rem"}}>
                            <img className="card-img-top img algo-image" src={element.imgUrl} alt="Card image cap"/>
                            <div style ={{backgroundColor:"transparent"}} className="card-body">
                                <h3 className="card-text algo-name">{element.name}</h3>
                            </div>
                        </div>
                        </li>
                    )}
                </ul>
            </div>
        )
    }
}
export default Home;