//class component
/*
import { Component } from "react";
export class UserData extends Component{
    constructor()
    {
        super();
        this.state={
            users:[]             //we will get array of json object in response.
        }
    }
    render(){
        return(
            <div>
                <h1>LIST OF USERS</h1>
                <table border={1} cellPadding={10}>
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>name</th>
                            <th>email</th>
                        </tr>
                    </thead>
                    <tbody>
	<tbody>
                        {
                            this.state.users.map((u)=>{
                                return(
                                    <tr>
                                        <td>{u.id}</td>
                                        <td>{u.name}</td>
                                        <td>{u.email}</td>
                                    </tr>
                                )

                            })
                        }

                    </tbody>


                    </tbody>

                </table>
            </div>
        ); 
    }
componentDidMount(){
        fetch('https://jsonplaceholder.typicode.com/users').then((response)=>{
            response.json().then((data)=>{
                this.setState({users:data});
            })

        }).catch((error)=>{
            console.log(error);
        })
    }
}*/

//Function Component
/*
import { useEffect,useState } from "react";


export function UserFetchData(){
    const [users,setUsers]=useState([]);
    useEffect(()=>{
        fetch('https://jsonplaceholder.typicode.com/users').then((response)=>{
            response.json().then((data)=>{
                setUsers(data);
                console.log(data);
            })

        }).catch((error)=>{
            console.log(error);
        })


    },[]);

return(
    <div>
        <h1>list of users</h1>
        <table border={1} cellSpacing={10}>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>email</th>
                    </tr>

                </thead>
                <tbody>
                    {
                        users.map((u)=>{
                            return(
                                <tr>
                                    <td>{u.id}</td>
                                    <td>{u.name}</td>
                                    <td>{u.email}</td>
                                </tr>
                            )

                        })
                       }


                </tbody>
                </table>
    </div>
)



}
*/    