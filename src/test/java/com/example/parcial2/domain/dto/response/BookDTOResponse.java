package com.example.parcial2.domain.dto.response;

import java.util.Date;

public record BookDTOResponse(
        Enum genre,
        Boolean available
) {
}
