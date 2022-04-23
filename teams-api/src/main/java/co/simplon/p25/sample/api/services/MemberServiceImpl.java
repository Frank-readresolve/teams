package co.simplon.p25.sample.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.p25.sample.api.dtos.MemberFirstName;
import co.simplon.p25.sample.api.dtos.MemberIdentity;
import co.simplon.p25.sample.api.entities.Member;
import co.simplon.p25.sample.api.repositories.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	private final MemberRepository repository;

	public MemberServiceImpl(MemberRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Member> getMembers() {
		return repository.findAll();
	}

	@Override
	public List<MemberIdentity> getMemberIdentities() {
		return repository.findAllProjectedBy(MemberIdentity.class);
	}

	@Override
	public List<MemberFirstName> getMemberFirstNames() {
		return repository.findAllProjectedBy(MemberFirstName.class);
	}
}
