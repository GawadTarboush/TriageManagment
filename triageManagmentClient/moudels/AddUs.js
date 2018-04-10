import React, { Component } from 'react';
import ReactDOM from 'react-dom';

class AddUs extends Component {

    callApi(){
        let userId = document.getElementById('userId');
        fetch('http://localhost:8181/insertUs', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                id: document.getElementById('fieldId').value ,
                ext_systems: document.getElementById('fieldExtSystems').value,
                descreption: document.getElementById('fieldDescreption').value,
                changeLLists: document.getElementById('changeLList').value
            })
          })
     }
render() {
   return (
      <div>
          <center>
             <input id='userId'></input>
             <button onClick={() => this.callApi()}>
                 Click here to call API
             </button>
         </center>
         <form>
             <fieldset>
                 <legend>Response:</legend>
                 Id: <textArea type="fieldId" id="fieldId"/><br/>
                 Descreption: <textArea type="fieldDescreption" id="fieldDescreption"/><br/>
                 ExtSystem: <textArea type="fieldExtSystem" id="fieldExtSystems"/><br/>
                 Change Lists: <textArea type="changeLList" id="changeLList"/>
             </fieldset>
         </form>
        
      </div>
   );
}

//    render() {
//       return (
//          <div>
//             <h2>AddUs</h2>
//          </div>
//       );
//    }
}
export default AddUs;