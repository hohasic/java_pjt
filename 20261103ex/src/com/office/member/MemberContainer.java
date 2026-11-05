package com.office.member;

public class MemberContainer {

	final private MemberController MEMBER_CONTROLLER = new MemberController();
	final private MemberService MEMBER_SERVICE = new MemberService();
	final private MemberDao MEMBER_DAO = new MemberDao();
	
	private static MemberContainer memberContainer;
	
	private MemberContainer() {}
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		
		return memberContainer;
		
	}

	public MemberController getMemberController() {
		return MEMBER_CONTROLLER;
	}

	public MemberService getMemberService() {
		return MEMBER_SERVICE;
	}

	public MemberDao getMemberDao() {
		return MEMBER_DAO;
	}
	
}
