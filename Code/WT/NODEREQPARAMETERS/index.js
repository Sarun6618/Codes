const express=require('express');
const app=express();
const port=5000;
app.get('/get/:name/:cname',(req,res)=>{
    res.send(`Hello `+req.params['name']+` ,${req.params['cname']} College Welcomes you`);
});
//http://localhost:5000/get/Sarun/KMIT
app.listen(port,()=>{
    console.log("Server startes on port ",port);
});