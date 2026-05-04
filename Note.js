const mongoose = require('mongoose')
const NoteSchema = new mongoose.Schema({
    text:String
})
const Note = mongoose.model('Note',NoteSchema)
module.exports = Note