const API = "http://localhost:8080/transactions"

function loadTransactions(){

fetch(API)
.then(res=>res.json())
.then(data=>{

const list=document.getElementById("list")
list.innerHTML=""

data.forEach(t=>{

const li=document.createElement("li")

li.innerHTML=
t.type + " - " +
t.amount + " - " +
t.description +
` <button onclick="deleteTransaction(${t.id})">Delete</button>`

list.appendChild(li)

})

})

}

function addTransaction(){

const type=document.getElementById("type").value
const amount=document.getElementById("amount").value
const description=document.getElementById("description").value

fetch(API,{
method:"POST",
headers:{
"Content-Type":"application/json"
},
body:JSON.stringify({
type:type,
amount:amount,
description:description
})
})
.then(()=>loadTransactions())

}

function deleteTransaction(id){

fetch(API+"/"+id,{
method:"DELETE"
})
.then(()=>loadTransactions())

}

loadTransactions()