const fs = require('fs');

fs.exists('First.js',(ans)=>{
	console.log(ans);
});

fs.stat('First.js',(err, ans)=>{
	console.log("Ans = ",ans);
});

fs.readFile('First.js',(err,data)=>{
	console.log(data.toString());
});

fs.writeFile('second.txt',"Hello world from darshan",(err)=>{
	console.log('File Written success')
});

fs.appendFile('second.txt'," ,darshan college",(err)=>{
	console.log('File Written success')
});

fs.readFile('first.txt',(err,data)=>{
	fs.writeFile('second.txt',data,(err)=>{})
})

fs.readFile('first.txt',(err,ans) =>{
	console.log(ans.toString());
});

fs.writeFile('first.txt',"HII",(err)=>{
	console.log('File Written success')
});


data = fs.readFileSync('second.txt')

console.log(data.toString());

console.log("Bye Bye");