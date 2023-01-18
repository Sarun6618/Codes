
const Customer = require('../model/customer.js') 

module.exports = (req,res)=>{
    var test={};
    if(req.body.cnamenew){
    test.cname=req.body.cnamenew };
    if(req.body.email){
        test.email=req.body.email };
    if(req.body.phone){
            test.phone=req.body.phone };
    if(req.body.city){
                test.city=req.body.city };
               // console.log(test);

Customer.updateOne({cname: req.body.cname}, { $set: test  },(error, customer) => { 
    if(error){ 
        console.log(customer)
        data='Can Not Update Coustomer Details Please Try Agin';
        res.render('update',{status:data});      
    }
    else{
        data = 'Customer Details Updated Successfully'
        res.render('update',{status:data});
    }
}
)
}
//{cname: req.body.cnamenew, email: req.body.email, phone: req.body.phone, city: req.body.city }