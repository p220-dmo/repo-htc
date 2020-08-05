package fr.htc.library.dao.impls;

import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.Storage;
import fr.htc.library.data.Member;

public class MemberDaoMapImp implements MemberDao {
	
	@Override
	public void save(Member member) {
		Storage.getMemberDB().put(member.getMatricule(), member);
	}

	@Override
	public Member findMemberByMatricule(String matricule) {
		return Storage.getMemberDB().get(matricule);
	}

}
