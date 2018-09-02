package org.debugroom.sample.aws.codepipeline.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.debugroom.sample.aws.codepipeline.domain.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
}
