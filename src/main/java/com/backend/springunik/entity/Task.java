package com.backend.springunik.entity;

import com.backend.springunik.entity.base_entity.BaseEntity;
import com.backend.springunik.entity.enums.Priority;
import com.backend.springunik.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@Builder
@Entity
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Task extends BaseEntity {
    String title;
    String description;
    String performerUsername;

    @Enumerated(EnumType.STRING)
    Status status;

    @Enumerated(EnumType.STRING)
    Priority priority;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    List<Comment> comments;

}
