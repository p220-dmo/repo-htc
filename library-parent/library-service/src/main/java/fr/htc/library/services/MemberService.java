package fr.htc.library.services;

import java.util.List;

import fr.htc.library.data.Member;

public interface MemberService {

	public void addMember(String firstName, String lastName, int age);

	public Member findMemberByMatricule(String matricule);

	public List<Member> getAllMembers();

	public Member deleteMember(String matricule);

	public Member update(String firstName, String lastName, int age);

}
