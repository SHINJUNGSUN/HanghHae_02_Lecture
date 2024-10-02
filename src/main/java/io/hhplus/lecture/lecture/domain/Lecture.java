package io.hhplus.lecture.lecture.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "lecture")
public class Lecture {

    @Id
    @Column(name = "lecture_id")
    private String lectureId;

    @Column(name = "title")
    private String title;

    @Column(name = "instructor")
    private String instructor;

    @Column(name = "description")
    private String description;
}
