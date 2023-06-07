package com.open.groupie.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.open.groupie.models.db.Group;

@Repository
public interface GroupRepository extends CrudRepository<Group, String> {
    List<Group> findAll();

    List<Group> findGroupsByNameContainingIgnoreCase(String keyWord);
}
