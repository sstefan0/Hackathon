import java.util.List;

/*
 * We solved the problem by separating each string in codeList into an array of strings that each represent
 *  one item of a group. After that we iterate through shoppingCart and check if the current shoppingCart item matches
 *  the requested item.
 *  
 *  Time complexity: O(n*m) where n is the length of codeList, and m is the length of shoppingCart
 *  Space complexity: O(n) where n is the number of individual items in codeList
 */

public class Foo {
	public static int isBuyerWinner(List<String> codeList, List<String> shoppingCart) {
		
		String [][] arrItems = new String[codeList.size()][];
		int itemsCount = 0, j = 0, k = 0;
		
		if(codeList.size() == 0 || shoppingCart.size() == 0) {
			
			return 0;
		}
		
		for(int i=0; i < codeList.size(); i++) {
			
			arrItems[i] = codeList.get(i).split(" ");
			itemsCount += arrItems[i].length;
		}
		
		if(itemsCount > shoppingCart.size()) {
			
			return 0;
		}
		
		for(int i=0; i<shoppingCart.size() && shoppingCart.size() - i >= itemsCount; i++) {
			if(shoppingCart.get(i).equals(arrItems[j][k]) || arrItems[j][k].equals("anything") && !shoppingCart.get(i).equals("")) {
				
				k++;				
				itemsCount--;
				
				if(k == arrItems[j].length) {
					if(j == arrItems.length - 1) {
						
						return 1;
					}
					
					k = 0;
					j++;
				}
			}
			else {
				
				itemsCount += k;
				i -= k;
				k = 0;
			}
		}

		return 0;
	}
}
