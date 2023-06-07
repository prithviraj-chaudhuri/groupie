package com.open.groupie.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.open.groupie.models.db.Group;
import com.open.groupie.repository.GroupRepository;

@Service
public class GroupService {

    private GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<Group> getAllGroups() {
        return groupRepository.findAll();

    }

    public List<Group> getAllGroupsMatchKeyword(String keyWord) {
        return groupRepository.findGroupsByNameContainingIgnoreCase(keyWord);
    }
}
