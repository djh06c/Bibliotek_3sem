package org.example.library.catalog.dto;

public record EditionDto(
        Long id,
        String editionNumber,
        int year,
        String format,
        PublisherDto publisher
) {}
