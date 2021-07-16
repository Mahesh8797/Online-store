import React, { Component } from 'react'
import axios from 'axios';
import {BrowserRouter ,Route,Switch,NavLink,nav,Link,Redirect, Router} from 'react-router-dom'
import Summary from './Summary'
 class Admin extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             emp:[{name:" ",skills:" ",summary:" "}],
             clicked:false
        }
    }
    
    componentDidMount=()=>
    {
        axios.get("http://localhost:8080/retrive").then(response=>{
            
            this.setState({ emp: response.data})
            console.log(this.state.emp)});
    }
    
    add=(summary)=>
    {
        alert(summary);
        this.setState({clicked:!this.state.clicked})
      return this.state.clicked? <h1>{summary}</h1> : null
    }
    render() {
        
        return (

            <div>
            <BrowserRouter>
            <Route path="/summary"><Summary/></Route>
            </BrowserRouter>
            <h1>Hello world</h1>
             
            { this.state.emp.map((map,index)=><h3 key={index}>Name: {map.name} skills: {map.skills} <nav><Link to={{ path:"/summary", summary:map.summary}} >Summary</Link></nav></h3>)}
            </div>
        )
    }
}

export default Admin
