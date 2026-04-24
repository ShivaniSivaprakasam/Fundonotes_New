package com.fundoonotes.fundoonotes.service;

import com.fundoonotes.fundoonotes.dto.NoteDTO;
import com.fundoonotes.fundoonotes.entity.Note;
import com.fundoonotes.fundoonotes.repository.NoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note createNote(NoteDTO dto) {
        Note note = new Note();
        note.setTitle(dto.getTitle());
        note.setDescription(dto.getDescription());

        return noteRepository.save(note);
    }
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
    public Note updateNote(Long id, NoteDTO dto) {

        Note note = noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Note not found"));

        note.setTitle(dto.getTitle());
        note.setDescription(dto.getDescription());

        return noteRepository.save(note);
    }
}