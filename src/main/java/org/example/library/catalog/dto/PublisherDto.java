package org.example.library.catalog.dto;

public record PublisherDto(
        Long id,
        String name,
        String address,
        String contactInfo
) {}
