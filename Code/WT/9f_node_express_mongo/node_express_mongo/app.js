var express = require('express');
var app = express();
const html = require('ejs')
const path=require('path')
app.use(express.json());
app.use(express.urlencoded({
  extended: true
}));

app.set('views', path.join(__dirname, 'view'))
app.set('view engine','ejs')
const mongoose=require('mongoose')
mongoose.connect('mongodb://127.0.0.1:27017/kmitdemo', function(error){
    if(error) console.log(error);
        console.log("connection successful");
});

const homeController = require('./controller/index');  //index page
const newCustomerController = require('./controller/newCustomer')   // new customer js
const storeCustomerController = require('./controller/storeCustomer')
const searchCustomerController = require('./controller/searchCustomer')
const fetchController= require('./controller/searchdb');
const fetchControllerPhone= require('./controller/searchdbphone');
const updateController= require('./controller/updatedoc')
const updateCustomerController = require('./controller/updateCustomer')


app.get('/',homeController);
app.get('/page/register',newCustomerController)   // register ejs page
app.post('/customer/register',storeCustomerController)
app.get('/page/search',searchCustomerController)
app.post('/customer/fetch',fetchController);
app.get('/page/update',updateCustomerController);
app.post('/customer/update',updateController);
app.post('/customer/fetchphone',fetchControllerPhone);


app.listen(3000, () => console.log("App listening on port 3000!"));