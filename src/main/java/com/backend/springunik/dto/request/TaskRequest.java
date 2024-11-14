package com.backend.springunik.dto.request;


import com.backend.springunik.entity.enums.Priority;
import com.backend.springunik.entity.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskRequest {
    String title;
    String description;
    String performerUsername;
    Status status;
    Priority priority;
}
