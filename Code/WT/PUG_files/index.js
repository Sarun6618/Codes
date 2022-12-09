const express=require('express');
const app=express();
const path=require("path");
const router=express.Router();
app.set("view engine", "pug");
app.set("views", path.join(__dirname, "views"));

app.use("/", router);

router.get('/',(req,res)=>{
    res.render("index");
});

router.get("/about", (req, res) => {
    res.render("about", { title: "Hey", message: "Welcome to KMIT! Thanks " });
  });
app.listen(3000,()=>{
    console.log("sever start at port 3000");
});