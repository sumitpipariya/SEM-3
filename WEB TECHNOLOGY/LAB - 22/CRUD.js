const express = require('express');

const app =express();

const name = ['abc','def','hij','xyz'];

app.get('/name' , (req,res) => {
	res.send(name)
})

app.get('/name/:index' , (req,res) => {
	res.send(name[req.params.index])
})

app.post('/name/:index' , (req,res) => {
	name.push(req.params.index)
	res.send(name)
})

app.delete('/name/:index', (req,res) => {
	name.splice(req.params.index,1);
	res.send(name)
})

app.put('/name/:index/:newname', (req,res) => {
	index = req.params.index;
	newname = req.params.newname;
	name[index] = newname;
	res.send(name)
})


app.listen(3000, () => {
	console.log("Server strted ")
})