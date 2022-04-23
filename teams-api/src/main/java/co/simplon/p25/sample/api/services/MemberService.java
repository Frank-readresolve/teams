package co.simplon.p25.sample.api.services;

import java.util.List;

import co.simplon.p25.sample.api.dtos.MemberFirstName;
import co.simplon.p25.sample.api.dtos.MemberIdentity;
import co.simplon.p25.sample.api.entities.Member;

public interface MemberService {

	List<Member> getMembers();

	// On declare la methode qui repond au besoin de selectionner et retourner
    // une projection de tous les objets Member et non les objets Member
    // directement
	List<MemberIdentity> getMemberIdentities();

	List<MemberFirstName> getMemberFirstNames();
}
