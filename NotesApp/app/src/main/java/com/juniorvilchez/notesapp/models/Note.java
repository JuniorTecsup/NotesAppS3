package com.juniorvilchez.notesapp.models;

import com.orm.dsl.Table;

import java.util.Date;

@Table
public class Note {

    private Long id;
    private String noteTitle;
    private String noteDescripion;
    private Date noteDate;
    private String noteState;

    public Note() {
    }

    public Note(String noteTitle, String noteDescripion, Date noteDate, String noteState) {
        this.noteTitle = noteTitle;
        this.noteDescripion = noteDescripion;
        this.noteDate = noteDate;
        this.noteState = noteState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteDescripion() {
        return noteDescripion;
    }

    public void setNoteDescripion(String noteDescripion) {
        this.noteDescripion = noteDescripion;
    }

    public Date getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Date noteDate) {
        this.noteDate = noteDate;
    }

    public String getNoteState() {
        return noteState;
    }

    public void setNoteState(String noteState) {
        this.noteState = noteState;
    }


}
