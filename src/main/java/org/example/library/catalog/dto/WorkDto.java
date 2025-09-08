package org.example.library.catalog.dto;

import org.example.library.catalog.dto.*;

import java.util.List;

public record WorkDto(
        Long id,
        String title,
        String workType,
        String details,
        String authors,
        List<EditionDto> editions
) {}
