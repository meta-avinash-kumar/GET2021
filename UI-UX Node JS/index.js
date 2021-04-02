import express from 'express';	//Importing installed package
var app = express();			// the fetched package
var port = process.env.PORT || 3000;
app.listen(port, () => { console.log("Running on port ", port); });
