const mongoose = require('mongoose');

const schema = mongoose.Schema({
    id : Number,
	Name : String,
    Subject : String,
	Department : String,
    Degree : String,
    Contact : Number,
	email : String
})

module.exports = mongoose.model("student" , schema);



	