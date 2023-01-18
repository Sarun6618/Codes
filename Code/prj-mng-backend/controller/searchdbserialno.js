const Desktop = require('../models/Desktop.js')
module.exports = (req,res)=>{

    Desktop.find({SerialNumber: req.body.SerialNumber}, (error, Desktop) => {
        if(error){
            console.log(Desktop)

            res.render('search',{stuData:Desktop});
        }
        else{
            console.log(Desktop)
            res.render('search',{stuData:Desktop, view:true});
        }

    })
}