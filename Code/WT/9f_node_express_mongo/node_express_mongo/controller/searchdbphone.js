const Customer = require('../model/customer.js') 
module.exports = (req,res)=>{ 
   
    Customer.find({phone: req.body.phone}, (error, customer) => { 
        if(error){ 
            console.log(customer)

            res.render('search',{stuData:customer});      
        }
        else{
            console.log(customer)
            res.render('search',{stuData:customer, view:true});
        }
              
    })     
}