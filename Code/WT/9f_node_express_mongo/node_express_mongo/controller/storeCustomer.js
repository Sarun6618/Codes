const Student = require('../model/customer.js')
const path = require('path')

module.exports = (req,res)=>{     console.log(req.body)

    Student.create(req.body, (error, student) => {
        if(error){
            console.log(error)
            data='Can Not Insert Coustomer Details Please Try Agin';
            res.render('register',{status:data});
        }
        else{
            data = 'Customer Details Inserted Successfully'
            res.render('register',{status:data});
        }

    })
}
