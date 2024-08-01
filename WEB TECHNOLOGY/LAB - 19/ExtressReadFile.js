const express = require("express")

const app = express();

const fs = require('fs');

app.get('/about' , (req,res) =>{
	const read = fs.readFileSync('about.txt')
	res.send(read.toString())
})

fs.writeFile('contact.txt' ,"Contact no : 9966552211" ,(err) => {
	console.log("Read file creted successfully ")
})

app.get('/contact' , (req,res) => {
	const write = fs.readFileSync('contact.txt')
	res.send(write.toString())
})


app.listen(3000);