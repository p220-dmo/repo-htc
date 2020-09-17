package fr.htc.library.services.impl;

import java.util.List;

import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.impls.MemberDaoMapImp;
import fr.htc.library.data.Member;
import fr.htc.library.services.MemberService;

public class MemberServiceImpl implements MemberService {
	private MemberDao  memberDao = new MemberDaoMapImp();
	

	public void addMember(String firstName, String lastName, int age) {
		if(firstName == null || lastName == null){
			System.err.println("Missing mandatory params..");
			return;
		}
		if("".equals(firstName)  || "".equals(lastName)){
			System.err.println("Empty string is not not a valid parmas");
			return;
		}
		
		Member member = new Member(firstName, lastName, age);
		
		memberDao.save(member);
		

	}

	public Member findMemberByMatricule(String matricule) {
		return null;
	}

	public List<Member> getAllMembers() {
		return null;
	}

	public Member deleteMember(String matricule) {
		return null;
	}

	public Member update(String firstName, String lastName, int age) {
		return null;
	}

}
