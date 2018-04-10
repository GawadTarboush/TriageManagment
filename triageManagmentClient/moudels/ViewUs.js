import React, { Component } from 'react';

class ViewUs extends Component {

    	callApi(){
           let userId = document.getElementById('userId');
            fetch(`http://localhost:8181/getUsById/${userId.value}`)
          
            .then((result) => {
           
            return result.json();
            }).then((jsonResult) => {
          
            console.log(jsonResult);
            document.getElementById('fieldId').value  = jsonResult.id;
            document.getElementById('fieldExtSystem').value  = jsonResult.ext_systems;
            document.getElementById('fieldDescreption').value  = jsonResult.descreption;
            document.getElementById('changeLList').value = jsonResult.changeLists;
            
            
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
                    ExtSystem: <textArea type="fieldExtSystem" id="fieldExtSystem"/><br/>
                    Change Lists: <textArea type="changeLList" id="changeLList"/>
                </fieldset>
            </form>
           
         </div>
      );
   }
}
export default ViewUs;