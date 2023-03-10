package com.example.datingplatformfordogs.tuple;

import lombok.Data;
import lombok.ToString;

import java.util.Objects;

public class WorkerCompanyDto {
    private final String workerName;
    private final String companyName;

    public WorkerCompanyDto(String workerName, String companyName) {
        this.workerName = workerName;
        this.companyName = companyName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerCompanyDto that = (WorkerCompanyDto) o;
        return Objects.equals(workerName, that.workerName) && Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerName, companyName);
    }
}
