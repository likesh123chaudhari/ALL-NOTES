import { Component } from "react";
import { Header } from "./Header";

export class About extends Component{
    render(){
        return(
            <div>
                <Header title="about title" description="about desp"></Header>
                <h2>more information on About us</h2>
            </div>
        );
    }

}