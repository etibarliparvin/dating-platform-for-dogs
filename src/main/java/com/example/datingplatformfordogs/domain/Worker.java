package com.example.datingplatformfordogs.domain;

import com.example.datingplatformfordogs.tuple.WorkerDto;
import lombok.Data;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@Data
@Table
@Entity(name = "worker")
@NamedNativeQuery(name = "Worker.findWorkerNameAndCompanyNameByCompanyId",
        query = "select w.name as workerName, c.name as companyName\n" +
                "from company c\n" +
                "         left join company_worker cw on c.id = cw.company_id\n" +
                "         left join worker w on cw.worker_id = w.id\n" +
                "where c.id = :id",
        resultSetMapping = "Mapping.WorkerDto")
@SqlResultSetMapping(name = "Mapping.WorkerDto",
        classes = @ConstructorResult(targetClass = WorkerDto.class,
                columns = {@ColumnResult(name = "workerName"),
                        @ColumnResult(name = "companyName")}))
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
}
