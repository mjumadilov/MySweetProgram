package replNew;

public class R163 {

	public static void main(String[] args) {

	}

	public boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
	
		if(isAvailable == false) {
			return false;
		}else if(month == 7 & (day <= 1 && day >=8) & year == 2018) {
			return false;
		}else if(year != 2018) {
			return false;
		}else {
			return true;
		}
		
	}
}
