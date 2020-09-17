package fr.htc.library.dao.impls;

import org.apache.commons.lang3.StringUtils;

import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.Storage;
import fr.htc.library.data.Member;
import fr.htc.library.matricule.exception.MatriculeMandatoryException;

public class MemberDaoMapImp implements MemberDao {

	public void save(Member member) {
		Storage.getMemberDB().put(member.getMatricule(), member);
	}

	public Member findMemberByMatricule(String matricule) throws MatriculeMandatoryException {
		if(StringUtils.isBlank(matricule)){
			throw new MatriculeMandatoryException("Null is not a valid matricule");

		}
		return Storage.getMemberDB().get(matricule);
	}
}