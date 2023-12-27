package com.practice.API.controller;

import com.practice.API.model.Content;
import com.practice.API.repository.ContentCollectionRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository contentCollectionRepository) {
        this.repository = contentCollectionRepository;
    }

    // make a request and find all the pieces of content in the system
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }

}
