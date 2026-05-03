
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

app.get('/notes',function(req,res){
    const data = fs.readFileSync('notes.json')
    const notes = JSON.parse(data)
    res.json(notes)})


 app.post('/notes',function(req,res){
    const data =fs.readFileSync('notes.json')
      const notes = JSON.parse(data)
    const newNote = req.body
    notes.push(newNote)
    fs.writeFileSync('notes.json',JSON.stringify(notes))
    res.json({"message":"notes added"})
 })   
 
 app.delete('/notes/:id',function(req,res){
    const data = fs.readFileSync('notes.json')
    let notes = JSON.parse(data)
    const id = Number(req.params.id)
    notes = notes.filter(function(note){
        return note.id!== id
    })
    fs.writeFileSync('notes.json',JSON.stringify(notes))
    res.json({"message":"delted"})
 })

 