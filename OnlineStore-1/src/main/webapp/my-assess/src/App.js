import React from 'react';
import logo from './logo.svg';
import {BrowserRouter ,Route,Switch,NavLink,nav,Link, Redirect} from 'react-router-dom'
import './App.css';
import Employee from './components/Employee'
import Admin from './components/Admin'
import Home from './components/Home'
import Summary from './components/Summary'
function App() {
  return (
    <div className="App">
    <BrowserRouter>
    <Switch>
    <Route path="/"><Home/></Route>
    <Route exact path={"/Employee"} component={Employee} /> 	 
    <Route exact path={"/Admin"} component={Admin}  />  
    <Route exact path={"/summary"} component={Summary}  />  
      </Switch>
      <Redirect to ="/"></Redirect>
      </BrowserRouter>
    </div>
  );
}

export default App;
