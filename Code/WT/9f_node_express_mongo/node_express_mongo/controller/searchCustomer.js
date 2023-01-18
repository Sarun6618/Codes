module.exports = (req, res) =>{
    customer=[]
    res.render('search',{stuData:customer, view:false});
}