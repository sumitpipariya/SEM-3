const mongoose = require('mongoose')

const Schema = mongoose.Schema({
	name : String,
	id : Number,
	salary : Number,
	address : String,
	age : Number
})

const faculty =  mongoose.model("Faculty",Schema)

module.exports = faculty;