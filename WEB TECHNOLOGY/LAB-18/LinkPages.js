const http = require("http")
const fs = require('fs')

const server = http.createServer((req,res) =>{
	const a = req.url
	res.setHeader('Content-Type','text/html');
	// res.write("Hello from my new server");

	if(a == '/home'){

		fs.writeFile('abc.txt' ,"This is home file" ,(err) => {
		console.log("home file created successfully")
	})
		fs.readFile('abc.txt' , (ree,data) => {
		ans = data.toString();
		res.end(ans)
	})	
	}

	else if(a == '/about'){
		fs.writeFile('abc.txt' ,"This is about" ,(err) => {
		console.log("About file created Successfully")
	})
		fs.readFile('abc.txt' , (ree,data) => {
		ans = data.toString();
		res.end(ans)
	})	
	}

	else if(a == '/contect'){
		fs.writeFile('abc.txt' ,"Number is : 9966332255" ,(err) => {
		console.log("Contact file created Successfully")
	})
		fs.readFile('abc.txt' , (ree,data) => {
		ans = data.toString();
		res.end(ans)
	})	
	}

	else if(a == '/edit'){
		fs.writeFile('abc.txt' ,"Click here to edit " ,(err) => {
		console.log("edit file created Successfully")
	})
		fs.readFile('abc.txt' , (ree,data) => {
		ans = data.toString();
		res.end(ans)
	})	
	}

	else if(a == '/help'){
		fs.writeFile('abc.txt' ,"Click here to help for website" ,(err) => {
		console.log("help file created Successfully")
	})
		fs.readFile('abc.txt' , (ree,data) => {
		ans = data.toString();
		res.end(ans)
	})	
	}

	else{
		res.end("Please enter valid input...")
	}

});


server.listen(5050,() =>{
	console.log("Server created at 5050");
});