package day50;

public class AdminUser extends SlackUser {

	int adminLevel;

	public AdminUser(String displayName, int timezone, String status, int adminLevel) {
		super(displayName, timezone, status);
		this.adminLevel = adminLevel;

	}

}
