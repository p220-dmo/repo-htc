package fr.htc.library.dao;

import fr.htc.library.data.Member;

public interface MemberDao {

	void save(Member member);

	Member findMemberByMatricule(String matricule);

}
