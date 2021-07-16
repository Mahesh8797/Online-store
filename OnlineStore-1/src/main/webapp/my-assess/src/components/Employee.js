import React, { Component } from 'react'
import axios from 'axios'
 class Employee extends Component {
    constructor(props) {
 super(props)
        this.state = {
             name:'',
             skills:'',
             summary:''
        }
    }
    onChangeEvent=(e)=>
    {
        this.setState({[e.target.name]:e.target.value})
    }
    submitEvent=()=>
    {

        axios.post("http://localhost:8080/addEmp",this.state)
        alert("Data saved")
    }
    render() {
        return (
            <div>
               <form onSubmit={this.submitEvent}>
              NAME: <input type="text" name="name"value={this.state.name} onChange={this.onChangeEvent}/><br/><br/>
              SKILLS: <input type="text" name="skills" value={this.state.skills} onChange={this.onChangeEvent}/><br/><br/>
              SUMMARY: <textarea type="text" name="summary" value={this.state.summary} onChange={this.onChangeEvent}/><br/><br/>
              <button type="submit">Submit</button>
               </form>
            </div>
        )
    }
}

export default Employee
