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
            document.getElementById('fieldExtSystem').value  = jsonResult.extSystems;
            document.getElementById('fieldDescreption').value  = jsonResult.descreption;
            
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
                    Id: <input type="fieldId" id="fieldId"/><br/>
                    Descreption: <input type="fieldDescreption" id="fieldDescreption"/><br/>
                    ExtSystem: <input type="fieldExtSystem" id="fieldExtSystem"/>
                </fieldset>
            </form>
           
         </div>
      );
   }
}
export default ViewUs;