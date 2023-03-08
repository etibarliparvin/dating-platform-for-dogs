package com.example.datingplatformfordogs.repository;

import com.example.datingplatformfordogs.domain.Worker;
import com.example.datingplatformfordogs.tuple.WorkerDto;
import com.example.datingplatformfordogs.tuple.WorkerName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

    @Query(value = "select w.*\n" +
            "from company c\n" +
            "         left join company_worker cw on c.id = cw.company_id\n" +
            "         left join worker w on cw.worker_id = w.id\n" +
            "where c.id = :id", nativeQuery = true)
    List<Worker> getWorkersByCompanyId(Long id);

    @Query(value = "select w.name\n" +
            "from company c\n" +
            "         left join company_worker cw on c.id = cw.company_id\n" +
            "         left join worker w on cw.worker_id = w.id\n" +
            "where c.id = :id", nativeQuery = true)
    List<WorkerName> findWorkersNameById(Long id);

    @Query(nativeQuery = true)
    List<WorkerDto> findWorkerNameAndCompanyNameByCompanyId(Long id);

//    @Query(value = "select w.name\n" +
//            "from company c\n" +
//            "         left join company_worker cw on c.id = cw.company_id\n" +
//            "         left join worker w on cw.worker_id = w.id\n" +
//            "where c.id = :id", nativeQuery = true)
//    List<Worker> getWorkersByCompanyId2(Long id); // alinmayacaq, cunki id-ni set ede bilmir
}
