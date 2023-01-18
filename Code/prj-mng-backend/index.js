console.log('Hello from the other side');
const mongoose=require('mongoose');
const express=require('express');
const app=express();
const path=require('path');
const html=require('ejs');
app.use(express.json());
app.use(express.urlencoded({
  extended: true
}));

app.set('views', path.join(__dirname, 'view'))
app.set('view engine','ejs')
const dbURI='mongodb://127.0.0.1:27017/AssetsData';
mongoose.connect(dbURI,{useNewUrlParser: true,/*useCreateIndex:true*/useUnifiedTopology: true,/*useFindAndModify:false*/})
.then(function(result){
    console.log("Database is connected");
})
.catch((err)=>console.log(err));
/*
const middleware=(req,res,next)=>{
    console.log('hello my middleware');
    next();
}
app.get('/',(req,res)=>{
    res.send("Mongodb altas is connected");
})
app.get('/Desktop',(req,res)=>{

})
app.get('/about',middleware,(req,res)=>{
    console.log("middleware about");
    res.send("It is about middleware");
})
app.listen(3000,()=>{
    console.log("running on 3000");
})*/
const homeController = require('./controller/index');  //index page
const newDesktopController = require('./controller/newDesktop')   // new Desktop js
const storeDesktopController = require('./controller/storeDesktop')
const searchDesktopController = require('./controller/searchDesktop')
const fetchController= require('./controller/searchdb');
const fetchControllerSerialNumber= require('./controller/searchdbserialno');
const updateController= require('./controller/updatedoc')
const updateDesktopController = require('./controller/updateDesktop')
app.get('/',homeController);
app.get('/desktop.ejs',newDesktopController)   // register ejs page
app.post('/Desktop/register',storeDesktopController)
app.get('/page/search',searchDesktopController)
app.post('/Desktop/fetch',fetchController);
app.get('/page/update',updateDesktopController);
app.post('/Desktop/update',updateController);
app.post('/Desktop/fetchSerialNumber',fetchControllerSerialNumber);


app.listen(3000, () => console.log("App listening on port 3000!"));