const express = require('express');

const mongoose = require('mongoose');

const body_Parser = require('body-parser');

const faculty = require('./FacultyJsen');

const ConnectingStsing = "mongodb+srv://23010101210:23010101210%40123@demo.ezt2c.mongodb.net/Faculty";

mongoose.connect(ConnectingStsing).then(() => {

	console.log("Mongobd connected");

	const app = express();

	app.use(body_Parser.urlencoded());

	//GET ALL
	app.get('/fac', async(req,res) => {
		const ans = await (faculty.find());
		res.send(ans)
	})

	//GET BY NAME
	app.get('/fac/:name', async(req,res) => {
		const ans = await(faculty.findOne({name:{$regex:req.params.name}}));
		// console.log(ans)
		// const abc = {$regex:ans}
		console.log(ans)
		res.send(ans);
	})

	//INSERT THE DATA
	app.post('/fac', async(req,res) => {
		fac = new faculty({...req.body});
		const ans = await fac.save();
		res.send("DATA SEND SUCCESSFULLY..");
	})

	//DELETE THE DATA
	app.delete('/fac/:name', async(req,res) => {
		const ans = await faculty.deleteOne({name:req.params.name});
		res.send("DATA DELETED..");
	})

	//UPDATE THE DATA
	app.patch('/fac/:name', async(req,res) => {
		const fac = await faculty.findOne({name:req.params.name});
		fac.name = req.body.name;
		const ans = await fac.save();
		res.send(ans)
	})


	app.listen(3500,() => {
		console.log("Server started @ 3500");
	})

})