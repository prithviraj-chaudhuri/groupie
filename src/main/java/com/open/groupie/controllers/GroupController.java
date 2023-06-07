package com.open.groupie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jms.core.JmsTemplate;

import com.open.groupie.models.db.Group;
import com.open.groupie.models.jms.JmsGroup;
import com.open.groupie.services.GroupService;

@RestController
@RequestMapping(value = "/group")
public class GroupController {

    private GroupService groupService;
    private JmsTemplate jmsTemplate;

    public GroupController(GroupService groupService, JmsTemplate jmsTemplate) {
        this.groupService = groupService;
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping
    public List<Group> getGroups() {
        JmsGroup group = new JmsGroup();
        group.setSource("Test");
        group.setMessage("TestMessage");
        jmsTemplate.convertAndSend("group", group);
        return groupService.getAllGroups();
    }

    @GetMapping(value = "/search/{keyword}")
    public List<Group> getGroupsByKeyword(@PathVariable(name = "keyword") String keyword) {
        System.out.println(keyword);
        return groupService.getAllGroupsMatchKeyword(keyword);
    }
}
