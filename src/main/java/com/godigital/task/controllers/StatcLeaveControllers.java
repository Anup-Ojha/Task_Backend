package com.godigital.task.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.godigital.task.entities.StaticLeaves;
import com.godigital.task.service.StaticLeavesService;

@RestController
@RequestMapping("/staticLeaves")
public class StatcLeaveControllers {

    @Autowired
    private StaticLeavesService staticLeavesService;

    @GetMapping
    public ResponseEntity<List<StaticLeaves>> getAllLeaves() {
        List<StaticLeaves> leaves = staticLeavesService.getAllLeaveRecords();
        return ResponseEntity.ok(leaves);
    }

    @GetMapping("/total")
    public ResponseEntity<Integer> getTotalLeavesCount() {
        Integer totalLeaveCount = staticLeavesService.getTotalLeaveCount();
        return ResponseEntity.ok(totalLeaveCount);
    }
}
