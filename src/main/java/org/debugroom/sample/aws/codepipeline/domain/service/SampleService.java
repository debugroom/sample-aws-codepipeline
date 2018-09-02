package org.debugroom.sample.aws.codepipeline.domain.service;

import java.util.List;

import org.debugroom.sample.aws.codepipeline.domain.entity.User;

public interface SampleService {

    public List<User> getUsers();

}
