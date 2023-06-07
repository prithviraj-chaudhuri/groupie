package com.open.groupie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.open.groupie.models.db.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUid(String uid);
}
