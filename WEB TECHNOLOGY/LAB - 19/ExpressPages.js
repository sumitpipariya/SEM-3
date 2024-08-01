const express = require("express")

const app = express();

app.get('/home' , (req,res) => {
	res.send("Hello from home")
})

app.get('/about' , (req,res) => {
	res.send("Hello from about")
})

app.get('/contect' , (req,res) => {
	res.send("Hello from contect")
})

app.get('/help' , (req,res) => {
	res.send("Hello from help")
})

app.get('/info' , (req,res) => {
	res.send("Hello from info")
})

app.listen(3000)