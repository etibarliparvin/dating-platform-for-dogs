package com.example.datingplatformfordogs.tuple;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WorkerDto {
    private String workerName;
    private String companyName;

    public WorkerDto(String workerName, String companyName) {
        this.workerName = workerName;
        this.companyName = companyName;
    }
}
