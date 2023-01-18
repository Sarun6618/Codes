
const Desktop = require('../models/Desktop.js')
module.exports = (req,res)=>{
        let reg=req.body.Model;
        console.log(reg);
    Desktop.find({Model: {$regex: reg, $options:"$i"}}, (error, Desktop) => {
        if(error){
            //console.log(Desktop)
            res.render('search',{stuData:Desktop});
        }
        else{
            //console.log(Desktop)
            res.render('search',{stuData:Desktop, view:true});
        }

    })
}

//{post_text:{$regex:"tutorialspoint"}})