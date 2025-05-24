import { useState } from "react";

/*export class ScoreBoard extends Component{
    constructor(){
        super();
        this.state={score:0};
           this.incrementScore=this.incrementScore.bind(this);
        this.decrementScore=this.decrementScore.bind(this);

    }
    incrementScore()
    {
       this.setState({score:this.state.score+4});
    }
    decrementScore()
    {
         this.setState({score:this.state.score-1});
    }
    render(){
        return(
            <div>
                <h1>{this.state.score}</h1>
                <button onClick={this.incrementScore}>+</button>
                <button onClick={this.decrementScore}>-</button>
            </div>
        );
    }
}*/
export function ScoreBoard()
{
    const [score,setScore]=useState(0);
    const [player,setPlayer]=useState("rahul");
    const incrementScore=()=>{
        setScore(score+4);
        }
        const decrementScore=()=>{
            setScore(score-1);
        }
        const changePlayer=()=>{
            setPlayer("Rohit");
        }
   return(
            <div>
              <h1>{player} has score {score} runs</h1>
                <button onClick={incrementScore}>+</button>
                <button onClick={decrementScore}>-</button>
                <button onClick={changePlayer}> ChangePlayer</button>
            </div>
        );
}