package com.common.secure_sdl.entities;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Topic {

    Integer id;
    String name;
    String description;
    String link;
}
