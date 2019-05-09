package com.membership.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mebership.model.Membership;
import com.membership.repo.Repository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class controller {
	@Autowired
	Repository membership ;

//@RequestMapping(value = "/membership/{id}", method = RequestMethod.POST)
//public Membership updateEmployee(@PathVariable("id") String id, @RequestBody Membership mem ) {
//	
//	
//	List<Membership> mem1=membership.findAll();Z
//	   for(Membership mem2:mem1) {

//		   if(mem2.getMembershipName().equals(id)) {
//			   return 		   
//		   }
//			   
//		   }	
//}
	
	@GetMapping("/{id}")
	public Optional<Membership> getOneMembership(@PathVariable("id") String id) {
		System.out.println(id);
		//System.err.println(" coming from UI "+id);
//		List<Membership> allMembershipFromDB=membership.findAll();
//		//System.err.println(allMembershipFromDB);
//		for(Membership member:allMembershipFromDB) {
//			//System.err.println(member.getMembershipName());
//			if(member.getMembershipName().equalsIgnoreCase(id)) {
//				System.out.println("you are "+member.getMembershipName()+" "+member.getFreewash()+" "+member.getPolishing());
//				return ("Your MemberShip is"+member.getMembershipName()+"  "+member.getFreewash()+" "+member.getPolishing());
//		}
		
	//	}
		System.out.println(membership.findById(id));
		return membership.findById(id);
	}
	@GetMapping("/all")
	public List<Membership> getall(){
		return membership.findAll();
	}
	@PostMapping("/save")
	public Membership addmember(@RequestBody Membership m) {
		return membership.save(m);
	}

	@GetMapping("/user/membership")
	public List<Membership> getMembership() {
		return membership.findAll();
	}
}