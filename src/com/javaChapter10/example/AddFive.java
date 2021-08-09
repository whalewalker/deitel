package com.javaChapter10.example;

import java.util.function.Function;

public class AddFive implements Function<Long, Long> {
    @Override
    public Long apply(Long aLong) {
        return aLong + 5;
    }
}
