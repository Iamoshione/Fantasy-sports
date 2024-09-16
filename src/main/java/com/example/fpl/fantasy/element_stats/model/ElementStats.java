package com.example.fpl.fantasy.element_stats.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "element_stats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ElementStats {

    @Id
    @Column(name = " Label")
    private String Label;

    @Column(name = "name")
    private String name;
}