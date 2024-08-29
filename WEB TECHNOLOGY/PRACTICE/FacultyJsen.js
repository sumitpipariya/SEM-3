const mongoose = require('mongoose');

const Schema = mongoose.Schema({
	name : String,
	subject : String,
	mobile : Number,
	age : Number,
	department : String
})

module.exports = mongoose.model("Facfulty", Schema);

