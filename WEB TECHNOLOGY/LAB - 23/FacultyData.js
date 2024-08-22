const mongoose = require('mongoose')

const express = require('express')

const bodyparser = require('body-parser')

const faculty = require('./Faculty')

const connectingString = "mongodb+srv://23010101210:23010101210%40123@demo.ezt2c.mongodb.net/Faculty"

mongoose.connect(connectingString).then(() => {
	console.log("Mongodb Connected");

	const app = express();

	app.use(bodyparser.urlencoded())

	//GET ALL
	app.get('/fac', async(req,res) =>{
		const ans = await faculty.find();
		res.send(ans);
	})

	//GET BY ID 
	app.get('/fac/:id',async(req,res) => {
		console.log(req.params.id)
		const ans =  await faculty.findOne({id:req.params.id})
		res.send(ans)
	})

	//POST
	app.post('/fac',async(req,res) => {
		const ans = new faculty({...req.body});
		res.send(await ans.save());
	})

	//UPDATE
	app.put('/fac/:id',async(req,res) => {
		const ans = await faculty.findOneAndUpdate({id:req.params.id},req.body,{new:true});
		res.send(ans)

	})

	//DELETE
	app.delete('/fac/:name',async(req,res) => {
		const ans = await faculty.findOneAndDelete({name:req.params.name},req.body);
		res.send("delated")
	})


	app.listen(3500,() => {
		console.log("Server started")
	})

})