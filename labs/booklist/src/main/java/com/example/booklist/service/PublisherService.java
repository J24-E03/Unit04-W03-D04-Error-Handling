package com.example.booklist.service;

import com.example.booklist.model.Publisher;
import com.example.booklist.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PublisherService {
    private final PublisherRepository publisherRepository;

    public List<Publisher> findAll() {
        return publisherRepository.findAll();
    }
}
