package com.example.springboot.controller.dto.host;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HostsearchReqeustDto {
    // 검색 조건에 대한 필드
    private String startDate;

    private String endDate;

    private String region;

    private String people;

    private String gender;

    private String farmsts;

}
