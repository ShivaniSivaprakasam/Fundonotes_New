package com.fundoonotes.fundoonotes.repository;

import com.fundoonotes.fundoonotes.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}