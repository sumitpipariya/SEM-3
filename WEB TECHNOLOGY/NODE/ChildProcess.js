const ChildProcess = require('child_process');

Child_Process.exec('Demo.java' ,(err,stdout,stdin) => {
	console.log(stdout);
})
