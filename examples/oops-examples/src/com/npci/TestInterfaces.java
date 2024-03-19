package com.npci;
// all the interfaces must be present in separate java files
interface RegularUser {
	void book();
}
interface AdminUser extends RegularUser {
	void modify();
}
class IrctcApp implements AdminUser {
	@Override
	public void book() {
		System.out.println("book() method");
	}
	@Override
	public void modify() {
		System.out.println("modify() method");
	}
}
public class TestInterfaces {
	public static void main(String[] args) {
		// developer3 who calls developer1 and developer2 code by creating object
		IrctcApp app = new IrctcApp();
		regularUserUI(app);
		adminUserUI(app);
	}
	// developer1 machine
	public static void regularUserUI(RegularUser user) {
		System.out.println("--- Regular User UI -----");
		user.book();
	}
	// developer2 machine
	public static void adminUserUI(AdminUser user) {
		System.out.println("--- Admin User UI -----");
		user.book();
		user.modify();
	}
}
