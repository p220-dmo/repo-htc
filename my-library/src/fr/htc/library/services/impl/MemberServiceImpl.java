package fr.htc.library.services.impl;

import java.util.List;

import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.impls.MemberDaoMapImp;
import fr.htc.library.data.Member;
import fr.htc.library.services.MemberService;

public class MemberServiceImpl implements MemberService {
	private MemberDao  memberDao = new MemberDaoMapImp();
	

	@Override
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

	@Override
	public Member findMemberByMatricule(String matricule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member deleteMember(String matricule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member update(String firstName, String lastName, int age) {
		// TODO Auto-generated method stub
		return null;
	}

}
