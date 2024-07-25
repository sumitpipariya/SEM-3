const ChildProcess = require('ChildProcess');

Child_Process.exec('Demo.java' ,(err,stdout,stdin) => {
	console.log(stdout);
})
