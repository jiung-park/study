package com.jiung.study.springboot.web.dto;

import com.jiung.study.springboot.web.HelloController;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
