package com.example.datingplatformfordogs.tuple;

import java.util.Objects;

public class TestDto {
    private final String firstName;

    public TestDto(String name) {
        this.firstName = name;
    }

    public String getName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestDto testDto = (TestDto) o;
        return Objects.equals(firstName, testDto.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }
}
