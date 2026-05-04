
const mongoose = require('mongoose')

mongoose.connect('mongodb+srv://shubhmharbola07:sanju456@cluster0.ogler.mongodb.net/notesapp?appName=Cluster0')
.then(() => console.log("Connected to MongoDB!"))
.catch((err) => console.log("Error connecting:", err))

const Note = require('./Note')
const express = require('express')
const app = express()
const fs = require('fs')
app.use(express.json())
app.listen(3000,function(){
    console.log("running")
})

// let notes = [
// {id :1, text :"buy groceries"},
// {id :2, text :"buy plants"},
// {id :3, text :"buy wax"},
// ]

app.get('/notes',async function (req,res) {
    const notes = await Note.find()
    res.json(notes)
    
})


app.post('/notes',async function(req,res){
    const note = new Note({text:req.body.text})
    await note.save()
    res.json({messsage:"note added"})
})
 
 app.delete('/notes/:id',async function(req,res){
   const id = req.params.id
  await Note.findByIdAndDelete(id)
   res.json({messsage :"delted"})
    })
    
 

 