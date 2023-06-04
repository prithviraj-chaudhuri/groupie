package com.open.groupie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.open.groupie.models.db.Group;
import com.open.groupie.models.db.User;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findAll();

    List<Group> findGroupsByUser_uidContain(String uid);

    List<Group> findGroupsByNameContains(String keyWord);
}
