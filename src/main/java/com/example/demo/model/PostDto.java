package com.example.demo.model;

import lombok.Getter;

@Getter
public class PostDto {
    /* post */
    private Integer postid;
    private String posttitle; // 10글자
    private String writtentime; // yyyy/MM/dd hh:mm:ss a
    private String context; // 글자 제한 없음.

}
