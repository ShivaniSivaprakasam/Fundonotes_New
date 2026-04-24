package com.fundoonotes.fundoonotes.controller;

import com.fundoonotes.fundoonotes.dto.NoteDTO;
import com.fundoonotes.fundoonotes.entity.Note;
import com.fundoonotes.fundoonotes.service.NoteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public Note createNote(@RequestBody NoteDTO dto) {
        return noteService.createNote(dto);
    }
    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }
}