package product;

public class TestProduct {
	public static void main(String[] args) {
		Productvali a = new Productvali();
		a.getInput();

		
		ParentProduct b = new ParentProduct();
		b.stock();
		ChildProduct childProduct = new ChildProduct();
		childProduct.stock(childProduct.stock, childProduct.quantity);
		productsabb p = new productsabb();
		p.checking();
		Iiproduct i = new Iiproduct();
		i.checking();
		i.status();
	}
}
