package org.example.testing.intergration.topdown.api;

import org.example.testing.intergration.topdown.dtos.BookDto;
import org.example.testing.intergration.topdown.model.Book;
import org.example.testing.intergration.topdown.services.LibraryService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topdown/library/")
@Profile("topdown")
public class LibraryController {

    private final LibraryService _libraryService;

    public LibraryController(LibraryService libraryService) {
        this._libraryService = libraryService;
    }

    @GetMapping("/get")
    public BookDto getBook(@RequestParam int id) {
        var s =  _libraryService.findById(id, b-> new BookDto(b.getTitle(), b.getAuthor(), b.getQuantity()) );
        return s;
    }

}
