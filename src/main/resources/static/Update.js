fetch("http://localhost:9002/update/{id}" { 
    method: 'put',
    headers: {
      "Content-type": "application/json" 
    },
    body: JSON.stringify()
  })
  .then(res => res.json())
  .then((data) => console.log(`Request succeeded with JSON response ${data}`))
  .catch((error) => console.log(`Request failed ${error}`))