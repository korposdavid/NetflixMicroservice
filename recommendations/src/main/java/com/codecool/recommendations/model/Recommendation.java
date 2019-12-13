package com.codecool.recommendations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recommendation {

    @Generated
    @Id
    private Long id;

    @Column(nullable = false)
    @Range(min=1, max=5)
    private Integer rating;

    private String comment;

    @Column(nullable = false)
    private Long videoId;
}
