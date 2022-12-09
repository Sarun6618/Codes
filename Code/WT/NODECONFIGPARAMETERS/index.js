const express=require('express');
const app=express();
config_data=require('./config/configpara.json')
app.get('/',(req,res)=>{
    res.send("Welcome to our website with configuration parameters")
});
app.listen(config_data.port,()=>{
    console.log("Server started on port",config_data.port)
});