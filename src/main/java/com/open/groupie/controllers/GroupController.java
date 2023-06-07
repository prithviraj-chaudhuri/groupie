package com.open.groupie.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.open.groupie.models.db.Group;
import com.open.groupie.services.GroupService;

@Controller
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

    @GetMapping(value = "/{keyword}")
    public List<Group> getGroupsByKeyword(@PathVariable String keyword) {
        return groupService.getAllGroupsMatchKeyword(keyword);
    }
}
