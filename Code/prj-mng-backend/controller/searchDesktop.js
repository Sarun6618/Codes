module.exports = (req, res) =>{
    Desktop=[]
    res.render('search',{stuData:Desktop, view:false});
}