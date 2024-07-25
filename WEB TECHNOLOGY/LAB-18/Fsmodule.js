const fs = new require("fs");

fs.exists('Fsmodule.js' ,(exists) => {
	console.log(exists);
});

fs.stat('Fsmodule.js' ,(err,data) =>{
	console.log(data);
})

fs.readFile('Fsmodule.js' , (ree,data) => {
	console.log(data.toString());
})

fs.writeFile('demo.txt' ,"Hii hello" ,(err) => {
	console.log("First file creted successfully ")
})

fs.appendFile('demo.txt' , "  Darshan University" ,(err) => {
	console.log("First file append successfully")
})

fs.writeFile('SecondDemo.txt' , "Hello World" , (err) => {
	console.log("Second File Created Successfully")
})

fs.readFile('demo.txt' ,(err,data) => {
	fs.writeFile('SecondDemo.txt' , data.toString() ,(err) =>{
		console.log("Two file added Successfully")
	})
})


data = fs.readFileSync('SecondDemo.txt');

console.log(data.toString());
