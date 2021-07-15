package com.example.demo.model;

import lombok.Getter;

@Getter
public class AdminDto {
    /* admin */
    private String admin_id; // 30글자
    private String admin_password; // 20글자
    private String admin_name; // 10글자
    private String admin_auth; // 인덱스로 권한확인 111: 모두 있음, 000: 모두 없음

}
