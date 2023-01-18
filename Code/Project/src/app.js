const express=require('express');
const app=express();
require("./db/connect");
const port=process.env.PORT || 3000;
app.get('/',(req, res)=>{
   res.send("Hello world!");
});


app.listen(port,()=>{
    console.log(`running om port no ${port})`);
});
