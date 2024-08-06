const express = require('express');

const app = express();

const arr = [
	
	{
		"name" :'abc',
		"rollno" :'10',
		"sem" :'3'
	},

	{
		"name":'asdf',
		"rollno":'45',
		"sem":'2'
	},

	{
		"name":'fghj',
		"rollno":'20',
		"sem":'1'
	},

	{
		"name":'uio',
		"rollno":'30',
		"sem":'5'
	}
]

app.get('/students', (req,res) => {
	res.send(arr)
})

app.get('/students/:index', (req,res) => {
	let a = arr[req.params.index].rollno
	res.send(a)
})

app.put('/students/:index', (req,res) => {
	index = req.params.index;
	update = req.body;
	arr[index] = update;
	res.send(arr)
})

app.listen(3000,() => {
	console.log("Server Stated")
})