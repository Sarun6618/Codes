const Student = require('../models/Desktop.js')
const path = require('path')

module.exports = (req,res)=>{     console.log(req.body)

    Student.create(req.body, (error, student) => {
        if(error){
            console.log(error)
            data='Can Not Insert Coustomer Details Please Try Agin';
            res.render('desktop',{status:data});
        }
        else{
            data = 'Desktop Details Inserted Successfully'
            res.render('desktop',{status:data});
        }

    })
}
