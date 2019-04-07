import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {
	
	@Test
	public void test_shoppingcardEmpty() {
		ShoppingCart shoppingCart = new ShoppingCart();
		Assert.assertTrue(shoppingCart.isEmpty());
	}
	
//	@Test
//	public void test2() {
//		ShoppingCart shoppingCart = new ShoppingCart();
//		shoppingCart.add(new Item("Mango",5));
//		Assert.assertFalse(shoppingCart.isEmpty());
//	}
//
//	@Test
//	public void test3() {
//		ShoppingCart shoppingCart = new ShoppingCart();
//		shoppingCart.add(new Item("Mango",5));
//		Assert.assertEquals(5, shoppingCart.totalPrice());
//	}
//	
////	@Test
////	public void test4() {
////		ShoppingCart shoppingCart = new ShoppingCart();
////		shoppingCart.add(new Item("Mango",5), 1);
////		shoppingCart.add(new Item("Apple",3), 2);
////		Assert.assertEquals(11, shoppingCart.totalPrice());
////	}
//	
//	@Test
//	public void test5() {
//		ShoppingCart shoppingCart = new ShoppingCart();
//		shoppingCart.add(new Item("Mango",5), 1);
//		List<String> items = Arrays.asList(new String[]{"1 Mango for $5"});
//		Assert.assertEquals(shoppingCart.getItems(),items);
//	}
//	
//	@Test
//	public void test6() {
//		ShoppingCart shoppingCart = new ShoppingCart();
//		shoppingCart.add(new Item("Mango",5));
//		shoppingCart.add(new Item("Apple",3), 2);
//		List<String> items = Arrays.asList(new String[]{"1 Mango for $5", "2 Apple for $6"});
//		Assert.assertEquals(shoppingCart.getItems(),items);
//		Assert.assertEquals(11, shoppingCart.totalPrice());
//	}
}
