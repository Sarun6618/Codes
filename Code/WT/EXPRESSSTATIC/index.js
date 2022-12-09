const express=require('express');
const app=express();
const port=3001;
express.static(__dirname); //for static images/pages
app.use(express.static('public'));
app.listen(port,()=>{
    console.log(`app is published on port ${port}`)
});