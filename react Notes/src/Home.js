import { Component } from "react";
import { Header } from "./Header";

export class Home extends Component{
    render(){
        return(
            <div>
                <Header title="funhome title" description="home desp"></Header>
                <h2>welcome to home Component</h2>
            </div>
            
        );
    }


}