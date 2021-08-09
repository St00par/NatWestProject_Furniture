

function delFunc() {
      fetch('localhost:9002/delete/{id}', {  
          method: 'delete'  
        })
        .then((data) => {
          console.log(`Request succeeded with JSON response ${data}`);
          // some function to execute if successful
        })
        .catch((error) => {
          //some function to execute if error
        });
        }