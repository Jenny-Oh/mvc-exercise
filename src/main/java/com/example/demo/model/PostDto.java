package com.example.demo.model;

import lombok.Getter;

@Getter
public class PostDto {
    /* post */
    private Integer post_id;
    private String post_title; // 10글자
    private String writtenDTT; // yyyy/MM/dd hh:mm:ss a
    private String context; // 글자 제한 없음.

}
