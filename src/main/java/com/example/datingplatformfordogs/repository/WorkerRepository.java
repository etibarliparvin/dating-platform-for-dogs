package com.example.datingplatformfordogs.repository;

import com.example.datingplatformfordogs.domain.Worker;
import com.example.datingplatformfordogs.tuple.TestDto;
import com.example.datingplatformfordogs.tuple.WorkerCompanyDto;
import com.example.datingplatformfordogs.tuple.WorkerDto;
import com.example.datingplatformfordogs.tuple.WorkerName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

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

//    @Query("select new WorkerCompanyDto(w.name as workerName, c.name as companyName) from company c left join company_worker cw on c.id = cw.company_id left join worker w on cw.worker_id = w.id where c.id = :id")
//    List<WorkerCompanyDto> findWorkersNameById3(@Param("id") Long id);

    @Query("select w from worker w where w.id = :id")
    Optional<Worker> foo(Long id);

    @Query("select new TestDto(w.name as firstName) from worker w w.name where w.id = :id")
    TestDto foo2(Long id);

    @Query(nativeQuery = true)
    List<WorkerDto> findWorkerNameAndCompanyNameByCompanyId(Long id);

//    @Query(value = "select new WorkerRecordDto(w.name as workerName, c.name as companyName) from company c " +
//            "left join company_worker cw on c.id = cw.company_id " +
//            "left join worker w on cw.worker_id = w.id " +
//            "where c.id = :id", nativeQuery = true)
//    List<WorkerRecordDto> findWorkersNameById2(@Param("id") Long id); // arawdir, niye iwlemedi?


//    @Query(value = "select w.name\n" +
//            "from company c\n" +
//            "         left join company_worker cw on c.id = cw.company_id\n" +
//            "         left join worker w on cw.worker_id = w.id\n" +
//            "where c.id = :id", nativeQuery = true)
//    List<Worker> getWorkersByCompanyId2(Long id); // alinmayacaq, cunki id-ni set ede bilmir
}
