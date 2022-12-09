const express=require('express')
const app=express();
const port=8888;

app.get('/',(req,res)=>{
    res.send("Hello World");
})

app.listen(port);
console.log(`Server Running at port ${port}`);