package org.debugroom.sample.aws.codepipeline.domain.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.debugroom.sample.aws.codepipeline.domain.entity.User;
import org.debugroom.sample.aws.codepipeline.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

}
