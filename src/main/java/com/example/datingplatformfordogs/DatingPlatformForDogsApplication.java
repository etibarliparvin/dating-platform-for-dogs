package com.example.datingplatformfordogs;

import com.example.datingplatformfordogs.domain.Worker;
import com.example.datingplatformfordogs.repository.CommentRepository;
import com.example.datingplatformfordogs.repository.PostRepository;
import com.example.datingplatformfordogs.repository.WorkerRepository;
import com.example.datingplatformfordogs.tuple.WorkerCompanyDto;
import com.example.datingplatformfordogs.tuple.WorkerDto;
import com.example.datingplatformfordogs.tuple.WorkerRecordDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DatingPlatformForDogsApplication implements CommandLineRunner {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final WorkerRepository workerRepository;

    public static void main(String[] args) {
        SpringApplication.run(DatingPlatformForDogsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        List<Comment> comments = commentRepository.findCommentsByPostId(1L);
//        System.out.println(comments);

//        Post post = postRepository.getPostByPostId(1L).get();
//        System.out.println(post);

//        List<Worker> workers = workerRepository.getWorkersByCompanyId(1L);
//        System.out.println(workers);

//        List<WorkerName> dtos = workerRepository.findWorkersNameById(1L);
//        dtos.forEach(a -> System.out.println(a.getName()));

//        List<WorkerDto> list =
//                workerRepository.findWorkerNameAndCompanyNameByCompanyId(1L);
//        System.out.println(list);

//        List<WorkerCompanyDto> dtos = workerRepository.findWorkersNameById3(1L);
//        System.out.println(dtos);

        Worker worker = workerRepository.foo(1L).get();
        System.out.println(worker);
    }
}
