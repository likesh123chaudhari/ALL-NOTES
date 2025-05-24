import { Component } from "react";

/*export class Header extends Component{
    render(){
        return(
            <div>
            <h1>{this.props.title}</h1>
            <p>{this.props.description}</p>
            </div>
        );
    }
}*/
export function Header(num){
    return(
        <div>
            <h1>{num.title}</h1>
            <p>{num.description}</p>
        </div>
    );
}