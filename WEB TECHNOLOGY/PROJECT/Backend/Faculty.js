const express = require('express');

const mongoose = require('mongoose');

const bodyParser = require('body-parser');

const Faculty = require('./FacultyJson.js');

const cors = require('cors');

const ConnectingString = "mongodb+srv://23010101210:23010101210%40123@demo.ezt2c.mongodb.net/?retryWrites=true&w=majority&appName=demo/test"
mongoose.connect(ConnectingString).then(() => {
	console.log("Connect with cloud database");

	const app = express();

	app.use(bodyParser.urlencoded());

	app.use(bodyParser.json());

    app.use(cors());

	//GET ALL 

	app.get('/Faculty', async(req,res) => {
		const ans = await Faculty.find();
		res.send(ans);
	})

	//GET BY ID 

	app.get('/Faculty/:id', async(req,res) => {
		const ans = await Faculty.findOne({id:req.params.id});
		res.send(ans);
	})

	//CREATE

	app.post('/Faculty', async(req,res) => {
		fac = new Faculty({...req.body})
		const ans = await fac.save();
		res.send(ans);
	})

	//DELETE

	app.delete('/Faculty/:id', async (req, res) => {
  try {
    
    const result = await Faculty.deleteOne({id:req.params.id });
    res.send(result);
  } catch (err) {
    console.error(err);
    res.status(500).send({ message: 'Error deleting faculty' });
  }
});


	//UPDATE

	app.put('/Faculty/:id', async(req,res) => {
		const fac = await Faculty.findOne({id:req.params.id})
		fac.Name = req.body.Name;
		fac.Subject = req.body.Subject;
		fac.Department = req.body.Department;
		fac.Degree = req.body.Degree;
		fac.Contact = req.body.Contact;
		fac.email = req.body.email;
		const ans = await fac.save();
		res.send(ans);
	}) 
	


	app.listen(3001,() => {
		console.log("Serever started at 3000")
	})

})