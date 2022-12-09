const express= require('express');
const app=express();
const port=3000;
app.get('/',(req,res)=>{
    res.send("Hello welcome to collage");
});
app.get('/kmit',(req,res)=>{
    res.send("KMIT collage welcomes you!");
});
app.get('/ngit',(req,res)=>{
    res.send("NGIT collage welcomes you!");
});
app.get('/kmec',(req,res)=>{
    res.send("KMEC collage welcomes you!");
});
app.listen(port,()=>{
    console.log(`app started on port ${port}`);
});
app.get("/Mypersonalsite", (req, res) => {
    res.sendFile(__dirname + "/index.html");
  });