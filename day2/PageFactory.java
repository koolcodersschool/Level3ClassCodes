package day2;

public class PageFactory {
	
	public static void main(String[] args) {
		
		String page = "YouTube";
		switch(page.toLowerCase()) {
		case Constants.GOOGLE:
			System.out.println("Open www.google.com");
			break;
		case Constants.YAHOO:
			System.out.println("Open www.yahoo.com");
			break;
		case Constants.AMAZON:
			System.out.println("Open www.amazon.com");
			break;
		default:
			System.out.println("ERROR: There is NOT such a page in our database: " + page);
		}
		
	}

}
