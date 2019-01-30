package com.onurkenis.simpleservice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Simple {
    @Id
    @GeneratedValue(generator = "id_generator")
    @SequenceGenerator(
            name = "answer_generator",
            sequenceName = "id_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "text")
    private String text;
}
