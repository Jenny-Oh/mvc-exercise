package com.example.demo.model;

import lombok.Getter;

@Getter
public class AdminDto {
    /* admin */
    private String adminid; // 30글자
    private String adminpassword; // 20글자
    private String adminname; // 10글자
    private String authority; // 인덱스로 권한확인 111: 모두 있음, 000: 모두 없음

}
