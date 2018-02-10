import React, { Component } from 'react';
import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';
import Home from './moudels/Home';
import AddUs from './moudels/AddUs';
import ViewUs from './moudels/ViewUs';

class App extends Component {
   render() {
      return (
         <Router>
            <div id="navigator">
               <ul>
                  <li><Link to={'/'}>Home</Link></li>
                  <li><Link to={'/AddUs'}>Add Us</Link></li>
                  <li><Link to={'/ViewUs'}>View Us</Link></li>
               </ul>
               {/* <hr /> */}
               
               <Switch>
                  <Route exact path='/' component={Home} />
                  <Route exact path='/AddUs' component={AddUs} />
                  <Route exact path='/ViewUs' component={ViewUs} />
               </Switch>
            </div>
         </Router>
      );
   }
}
export default App;