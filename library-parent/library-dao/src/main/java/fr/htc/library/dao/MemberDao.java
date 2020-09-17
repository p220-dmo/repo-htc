package fr.htc.library.dao;

import fr.htc.library.data.Member;
import fr.htc.library.matricule.exception.MatriculeMandatoryException;

public interface MemberDao {

	void save(Member member);

	Member findMemberByMatricule(String matricule) throws MatriculeMandatoryException;

}
