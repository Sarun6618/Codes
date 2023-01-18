
const Desktop = require('../models/Desktop.js')

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

Desktop.updateOne({cname: req.body.cname}, { $set: test  },(error, Desktop) => {
    if(error){
        console.log(Desktop)
        data='Can Not Update Coustomer Details Please Try Agin';
        res.render('update',{status:data});
    }
    else{
        data = 'Desktop Details Updated Successfully'
        res.render('update',{status:data});
    }
}
)
}
//{cname: req.body.cnamenew, email: req.body.email, phone: req.body.phone, city: req.body.city }