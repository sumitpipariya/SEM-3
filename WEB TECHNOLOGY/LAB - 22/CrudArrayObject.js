const express = require('express');

const app = express();

const body_parser = require('body-Parser')

app.use(body_parser.urlencoded())

const students = [
	
	{
		"id" : '1',
		"name" :'abc',
		"rollno" :'10',
		"sem" : 3,
		"email" : 'abc@abc.com'
	},

	{
		"id" : '2',
		"name":'asdf',
		"rollno":'45',
		"sem": 2,
		"email" : 'asdf@asdf.com'
	},

	{
		"id" : '3',
		"name":'fghj',
		"rollno":'20',
		"sem": 1,
		"email" : 'fghj@asdf.com'
	},

	{
		"id" : '4',
		"name":'xyz',
		"rollno":'30',
		"sem": 5,
		"email" : 'xyz@abc.com'

	}
]


//get all element
app.get('/students', (req,res) => {
	res.send(students)
})


//get element by id 
app.get('/students/:index', (req,res) => {
	const ans = students.find( (stu) => stu.id == req.params.index)
	res.send(ans);
})


//create the data
app.post('/students', (req,res) => {
	students.push(req.body)
	res.send('Studend added')
})


//delete the data
app.delete('/students/:id', (req,res) => {
	const indextoDelete = students.findIndex((stu) => stu.id == req.params.id)
	students.splice(indextoDelete,1);
	res.send('Student Deleted')
})
	

//update the data
app.put('/students/:id', (req,res) => {
	const idtoupdate = students.findIndex((stu) => stu.id == req.params.id)
	students[idtoupdate] = req.body;
	res.send('Student Updated')
})

//search the data
app.get('/students/search/:text', (req,res) => {
	const ans = students.finter((stu) => stu.name.indexof(req.params.text>-1))
	res.send(ans)
})



app.listen(3000,() => {
	console.log("Server Stated")
})