function readFunc() {
        fetch("http://localhost:9002/getAll") 
            .then((response) => {
                return response.json();
            })
            .then((data) => {
                console.log(data);
                let div = document.querySelector('.main');
                const furniture = data;
                const furnitureContainer = document.createElement('div');
                div.appendChild(furnitureContainer);
                furniture.forEach((item) => {
                console.log(item)
                const pId = document.createElement("p");
                const pType = document.createElement("p");
                const pMaterial = document.createElement("p");
                const pCost = document.createElement("p");
                pId.innerText = item.id;
                pType.innerText = item.type;
                pMaterial.innerText = item.material;
                pCost.innerText = item.cost;
                furnitureContainer.appendChild(pId);
                furnitureContainer.appendChild(pType);
                furnitureContainer.appendChild(pMaterial);
                furnitureContainer.appendChild(pCost);
                });
                div.appendChild(furnitureContainer);
                })
                .catch((error) => console.log(error));
            }  