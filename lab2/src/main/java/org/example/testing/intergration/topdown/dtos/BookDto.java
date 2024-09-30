package org.example.testing.intergration.topdown.dtos;

import org.example.testing.intergration.topdown.model.Borrowing;

import java.util.Collection;
import java.util.function.Function;

public record BookDto(String title, String author, Long quantity) {
}
