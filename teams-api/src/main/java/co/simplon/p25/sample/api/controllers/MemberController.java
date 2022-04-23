package co.simplon.p25.sample.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.sample.api.dtos.MemberFirstName;
import co.simplon.p25.sample.api.dtos.MemberIdentity;
import co.simplon.p25.sample.api.entities.Member;
import co.simplon.p25.sample.api.services.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {

	private final MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}

	@GetMapping
	public List<Member> getMembers() {
		return service.getMembers();
	}
	
	@GetMapping("/identities")
	public List<MemberIdentity> getMemberIdenties() {
		return service.getMemberIdentities();
	}
	
	@GetMapping("/first-names")
	public List<MemberFirstName> getMemberFirstNames() {
		return service.getMemberFirstNames();
	}
	
}
