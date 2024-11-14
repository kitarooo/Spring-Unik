package com.backend.springunik.dto.request;

import com.backend.springunik.entity.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StatusRequest {
    Status status;
}
