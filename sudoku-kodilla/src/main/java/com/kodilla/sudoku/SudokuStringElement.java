package com.kodilla.sudoku;

public enum SudokuStringElement {

    ONE ("1"),
    TWO ("2"),
    THREE ("3"),
    FOUR ("4"),
    FIVE ("5"),
    SIX ("6"),
    SEVEN ("7"),
    EIGHT ("8"),
    NINE ("9");

    private String stringElement;

    SudokuStringElement(String stringElement) {
        this.stringElement = stringElement;
    }

    public String getStringElement() {
        return stringElement;
    }
}