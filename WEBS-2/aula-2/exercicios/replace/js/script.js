let desserts = ["bolo de chocolate", "bolacha", "semifrio", "pudim"];

// for(let i = 0; i < desserts.length; i++)
// {
//     console.log(desserts[i]);

// }

// for(let item of desserts)
//     {
//         console.log(item);
//     }

// for(let item in desserts)
// {
//     console.log(item);
// }

// let shoppingList = [];
// let item = "";
// while (item !== "fim")
//     {
//     item = prompt("Adicione um item à sua lista de compras (ou digite 'fim' para terminar):");

//     if (item !== "fim")
//     {
//         shoppingList.push(item);
//     }
// }

// console.log("Sua lista de compras: ", shoppingList);

function shoppingList()
{
    let shoppingList = [];
let item = "";
while (item !== "fim")
    {
    item = prompt("Adicione um item à sua lista de compras (ou digite 'fim' para terminar):");

    if (item !== "fim")
    {
        shoppingList.push(item);
    }
}
}

function rant(message)
{
    for (let i = 1; i < 4; i++)
    {
        console.log(i, message.toUpperCase());
    }
}