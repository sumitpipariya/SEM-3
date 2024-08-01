const express = require("express")

const app = express();

const fs = require('fs');

app.get('/about' , (req,res) =>{
	const read = fs.readFileSync('about.txt')
	res.send(read.toString())
})

app.get('/create_contact_file/:no' , (req,res) => {
	fs.writeFile('contact.txt' ,"Contact no : "+req.params.no ,(err) => {
		res.send("Read file creted successfully ")

	})
})

// app.get('/:l',(req,res)=>{
// 	res.send(req.params.l)
// })

app.get('/contact' , (req,res) => {
	const write = fs.readFileSync('contact.txt')
	res.send(write.toString())
})


app.listen(3000);