//auto update nodemon

const http = require("http")

const server = http.createServer((req,res) =>{
	const a = req.url
	res.setHeader('Content-Type','text/html');
	// res.write("Hello from my new server");

	if(a == '/home'){
		res.end("Home")
	}
	else if(a == '/about'){
		res.end("about")
	}
	else if(a == '/contect'){
		res.end("Contact Number : 123456789")
	}
	else if(a == '/edit'){
		res.end("Click here to edit somthing")
	}
	else if(a == '/help'){
		res.end("click here to help")
	}
	else{
		res.end("Invalid input")
	}

});



server.listen(5000,() =>{
	console.log("Server created at 5000");
});