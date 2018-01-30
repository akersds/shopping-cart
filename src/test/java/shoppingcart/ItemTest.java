package shoppingcart;

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {

	@Test
	public void shouldInstantiateItem() {
		Item underTest = new Item();

		assertNotNull(underTest);
	}
	
	 @Test
	public void shouldInstantiateAItemObjectWithNamePriceQuantity() {
	Item underTest = new Item("Name", 0.25, 3);
	
	assertNotNull(underTest);
	 }

	@Test
	public void shouldReturnItemWithNameToy() { 
	Item underTest = new Item ("Toy",12.00, 8);
	String check = underTest.getName();
	assertEquals("Toy", check);
	}
	
	@Test
	public void shouldReturnItemWithPrice12(){
	Item underTest = new Item ("Toy",12, 8);
	double check = underTest.getPrice();
	assertEquals(12.00, check, 0.001);
	}
	
	@Test
	public void shouldReturnItemWithQuantity(){
	Item underTest = new Item ("Toy",12, 8);
	int check = underTest.getQuantity ();
	assertEquals(8, check);
		
	}
	
	
		
	
	}
	//
	// }
	//
	// @Test
	// public void shouldReturnNumberOfBoxesAsOne() {
	// CookieOrder underTest = new CookieOrder("", 1);
	// int check = underTest.getNumBoxes();
	//
	// assertEquals(1, check);
	// }
	//
	//
	//
