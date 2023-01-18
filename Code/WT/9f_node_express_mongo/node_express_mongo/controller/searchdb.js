
const Customer = require('../model/customer.js') 
module.exports = (req,res)=>{ 
        let reg=req.body.city;
        console.log(reg);
    Customer.find({city: {$regex: reg, $options:"$i"}}, (error, customer) => { 
        if(error){ 
            //console.log(customer)
            res.render('search',{stuData:customer});      
        }
        else{
            //console.log(customer)
            res.render('search',{stuData:customer, view:true});
        }
              
    })     
}

//{post_text:{$regex:"tutorialspoint"}})