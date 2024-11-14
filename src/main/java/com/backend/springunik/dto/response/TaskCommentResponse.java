package com.backend.springunik.dto.response;

import com.backend.springunik.entity.enums.Priority;
import com.backend.springunik.entity.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskCommentResponse {
    Long id;
    String title;
    String performerUsername;
    String description;
    Status status;
    Priority priority;
    List<CommentResponse> comments;
}
