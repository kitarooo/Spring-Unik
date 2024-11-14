package com.backend.springunik.entity.base_entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name",nullable = false)
    String name;

    @Column(name = "phone_number", nullable = false)
    String phoneNumber;

    @Column(updatable = false, nullable = false)
    @CreationTimestamp
    LocalDateTime createdDate;

    @Column(nullable = false)
    @UpdateTimestamp
    LocalDateTime lastModifiedDate;

    @Version
    @Column(nullable = false)
    Integer version;
}

