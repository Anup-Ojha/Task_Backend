//package com.godigital.task.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.godigital.task.entities.Leave;
//import com.godigital.task.repository.LeaveRepo;
//
//@RestController
//public class LeaveController {
//
//	@Autowired
//	private LeaveRepo leaveRepo;
//	
//	@GetMapping("/leave/details")
//	public List<Leave> getAllLeaveds(){
//		return (List<Leave>)leaveRepo.findAll();
//	}
//	
//	@PostMapping("/leave/add")
//	public Leave addANewLeave(@RequestBody Leave leaveData) {
//		return leaveRepo.save(leaveData);
//	}
//	
//	@DeleteMapping("/leave/delete/{id}")
//	public String deleteLeaveRequest(@PathVariable Integer id) {
//		leaveRepo.deleteById(id);
//		return "Leave Request deleted of Id "+id+" ";
//	}
//	
//	@GetMapping("/leave/{id}")
//	public List<Leave> findAllByleaveId(@PathVariable Integer id){
//		return (List<Leave>) leaveRepo.findAllByleaveId(id);
//	}
//	
//	
//}
