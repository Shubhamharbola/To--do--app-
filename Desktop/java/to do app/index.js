const express = require('express')
const app = express()
app.use(express.json())
app.listen(3000,function(){
    console.log("running")
})

let notes = [
{id :1, text :"buy groceries"},
{id :2, text :"buy plants"},
{id :3, text :"buy wax"},
]

app.get('/notes',function(req,res){
    res.json(notes)})


 app.post('/notes',function(req,res){
    const newNote = req.body
    notes.push(newNote)
    res.json({"message":"notes added"})
 })   
 
 app.delete('/notes/:id',function(req,res){
    const id = Number(req.params.id)
    notes = notes.filter(function(note){
        return note.id!== id
    })
    res.json({"message":"delted"})
 })

 