import React, { Component } from 'react'
import {BrowserRouter ,Route,Switch,NavLink,nav,Link,Redirect} from 'react-router-dom'
import Employee from './Employee'
import Admin from './Admin'
function Home()
 {
    
        return (
            
            <div>
            <BrowserRouter>
            <nav>
            <Link to ="/Employee">Employee</Link> <br/>
            <Link to ="/Admin">Admin</Link>
            </nav>
            <Switch>
            <Route exact path="/Employee" component={Employee} >             
             </Route>            
             <Route exact path="/Admin" component={Admin}>              
             </Route>
            </Switch>
            </BrowserRouter>
            
                
            </div>
        )
    
}

export default Home
