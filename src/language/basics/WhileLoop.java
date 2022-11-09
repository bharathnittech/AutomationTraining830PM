package language.basics;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 2;

		while (i < 1) {
//			if(applicationPage.isDisplayed())
//				break;
//			refreshPage();
			System.out.println(i);
			i--;
		}

		do{
			System.out.println(i);
			i--;
		}while (i < 1);

	}

}
