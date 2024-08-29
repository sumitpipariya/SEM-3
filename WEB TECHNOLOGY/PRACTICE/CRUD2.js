const express = require('express');

const mongoose = require('mongoose');

const bodyParser = require('body-parser');

const Student = require('./Student.js');

const ConnectingString = "mongodb+srv://23010101210:23010101210%40123@demo.ezt2c.mongodb.net/DEMO";

mongoose.connect(ConnectingString).then(() => {
	console.log("Connect with cloud database");

	const app = express();

	app.use(bodyParser.urlencoded())


	//GET ALL 

	app.get('/Students', async(req,res) => {
		const ans = await(Student.find());
		res.send(ans);
	})

	//GET BY ID 

	app.get('/Students/:id', async(req,res) => {
		const ans = await(Student.findOne({id:req.params.id}));
		res.send(ans);
	})

	//CREATE

	app.post('Students', async(req,res) => {
		stu = new students({...req.body})
		const ans = await stu.save();
		res.send(ans);
	})

	//DELETE

	app.delete('/Students/:id', async(req,res) => {
		const ans = await(Student.deleteOne({id:req.params.id}));
		res.send(ans);
	})

	//UPDATE

	app.patch('/Students/:id', async(req,res) => {
		const stu = await Students.findOne({id:req.params.id})
		stu.name = req.body.name;
		const ans = await stu.save();
		res.send(ans);
	}) 
	


	app.listen(3000,() => {
		console.log("Serever started at 3000")
	})

})