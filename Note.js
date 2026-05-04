const mongoose = require('mongoose')
const schema = new mongoose.Schema({
    text:String
})
const Note = moongose.model('Note',NoteSchema)
module.exports = Note