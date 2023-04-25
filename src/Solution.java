import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int codeListCount = Integer.parseInt(scanner.nextLine().trim());

        List<String> codeList = new ArrayList<String>();

        for (int i = 0; i < codeListCount; i++)
        {
            String codeListItem = scanner.nextLine();
            codeList.add(codeListItem);
        }

        int shoppingCartCount = Integer.parseInt(scanner.nextLine().trim());

        List<String> shoppingCart = new ArrayList<String>();

        for (int i = 0; i < shoppingCartCount; i++)
        {
            String shoppingCartItem = scanner.nextLine();
            shoppingCart.add(shoppingCartItem);
        }
        
        scanner.close();

        int foo = Foo.isBuyerWinner(codeList, shoppingCart);

        System.out.println(foo);

	}

}
