package com.open.groupie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open.groupie.models.db.Group;
import com.open.groupie.services.GroupService;

@RestController
@RequestMapping(value = "/group")
public class GroupController {

    private GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public List<Group> getGroups() {
        return groupService.getAllGroups();
    }

    @GetMapping(value = "/search/{keyword}")
    public List<Group> getGroupsByKeyword(@PathVariable(name = "keyword") String keyword) {
        System.out.println(keyword);
        return groupService.getAllGroupsMatchKeyword(keyword);
    }
}
