package com.xuetangx.zidongdati.xuetangyun.dto;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseScheduleDto {
    private String course;

    private String user;

    private Integer schedule;
}
