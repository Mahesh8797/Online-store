import React, { Component } from 'react'
import axios from 'axios'
export class AddProd extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             updateprod:[{ productIdd:0, productName:'',price:0.0}]
        }
    }
    changeEvent=(e)=>
    {
     this.setState({ [e.target.name]:e.target.value})
    }

    submitEvent=(e)=>
    {
        e.preventDefault();
        axios.post("http://localhost:8081/addProd", this.state).then(response=>console.log("data added" +response))
    }
    render() {

        return (
            <div>
                <form onSubmit={this.submitEvent}>
               Produt Id: <input type="number" name="productId" onChange={this.changeEvent}/><br/>
               Product name: <input type="text" name="productName" onChange={this.changeEvent}/><br/>
               PRoduct price: <input type="number" name="price" onChange={this.changeEvent}/>
                <br/>
                <button type="submit">Submit</button>
                </form>
            </div>
        )
    }
}

export default AddProd
