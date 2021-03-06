function updateFunc() {
        	let id = document.getElementsByName("f_id")[0].value;
        	let inputType = document.getElementsByName("f_type")[0].value;
            let inputMat = document.getElementsByName("f_material")[0].value;
            let inputCost = document.getElementsByName("f_cost")[0].value;
        	fetch("http://localhost:9002/update/"+id, { 
        	    method: 'put', 
        	    headers: {
        	      "Content-type": "application/json" 
        	    },
        	    body: JSON.stringify(
        	      {
        	        "type": inputType,
        	        "material": inputMat,
        	        "cost": inputCost
        	      }
        	    )
        	  })
        	  .then(res => res.json())
        	  .then((data) => console.log(`Request succeeded with JSON response ${data}`))
    		  .catch((error) => console.log(`Request failed ${error}`))
        	  }