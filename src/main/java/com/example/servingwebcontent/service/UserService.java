package com.example.servingwebcontent.service;

import com.example.servingwebcontent.domain.Job;
import com.example.servingwebcontent.domain.User;
import com.example.servingwebcontent.dto.JobDto;
import com.example.servingwebcontent.dto.UserDto;
import com.example.servingwebcontent.repo.JobRepository;
import com.example.servingwebcontent.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    private JobRepository jobRepository;

    public UserService(UserRepository userRepository, JobRepository jobRepository) {
        this.userRepository = userRepository;
        this.jobRepository = jobRepository;
    }

    public Long save(User user) {
        return userRepository.save(user).getId();
    }

    public UserDto findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("пользователь не найлен"));
        List<Job> jobs = (List<Job>) jobRepository.findById(id).orElseThrow(() -> new RuntimeException("пользователь не найлен"));
        String surname = user.getSurname();
        String name = user.getName();
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setName(name);
        userDto.setSurname(surname);
        userDto.setJobs(jobs);
        return (userDto);
    }

    public void saveJob(long userId, Job job) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("пользователь не найлен"));
        /*List<Job> jobs = user.getJobs();
        jobs.add(job);
        userRepository.save(user);*/
        job.setUser(user);
        jobRepository.save(job);
    }




}
