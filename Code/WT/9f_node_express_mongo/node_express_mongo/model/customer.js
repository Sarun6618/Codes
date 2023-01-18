const mongoose = require('mongoose')
const Schema = mongoose.Schema;
const CustomerSchema = new Schema({ 
    cname: {
        type: String,
        required: true,
        unique: true
    },
    email: {
        type: String,
        required: true
    },
    phone: {
        type: String,
        required: true
    } ,
    city: {
        type: String,
        required: true
    }
})


// export model
const Customer = mongoose.model('Customer',CustomerSchema);
module.exports = Customer