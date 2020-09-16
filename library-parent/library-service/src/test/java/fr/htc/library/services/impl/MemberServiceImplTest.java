package fr.htc.library.services.impl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.htc.library.dao.Storage;
import fr.htc.library.services.MemberService;


@RunWith(JUnit4.class)
public class MemberServiceImplTest {

	private MemberService memberServiceImpl = new MemberServiceImpl() ;

	@Test
	public final void testAddMember() {
		final String firstName = "Djamel";
		final String lastName = "MOUCHENE";
		final int age = 37;


		Assert.assertTrue("The data base should be empty", !Storage.getMemberDB().isEmpty());
		fail("Not yet implemented");
		memberServiceImpl.addMember(firstName, lastName, age);

		assertNull("should be null", new Integer("5"));

	}

	@Test
	public final void testFindMemberByMatricule() {
		//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAllMembers() {
		//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDeleteMember() {
		//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdate() {
		//		fail("Not yet implemented"); // TODO: add log management
	}

}
