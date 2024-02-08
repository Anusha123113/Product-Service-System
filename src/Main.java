import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            ProductService service = new ProductService();
            //hey service add the product

        service.addProduct( new Product("Asus vivobook","Laptop","Brown Table","Two years"));
        service.addProduct( new Product("mouse","Wireless","bag","Three years"));
        service.addProduct( new Product("Stick notes","Pinned","Table","Two years"));
        service.addProduct( new Product("Review book","sticked","White Table","one years"));
        service.addProduct( new Product("Templates","paper","Cup board","Three years"));

        //List<Product> products= service.getAllProducts();
        //for(Product p : products)
        //{
          //  System.out.println(p);
        //}
        //System.out.println("...............................................");
        //System.out.println("To get a particular product");
        //Product p=service.getProduct("Templates");
        //System.out.println(p);
        System.out.println("...............................................");
        System.out.println("To get a particular text");
        List<Product> prods = service.getProductWithText("Templates");
        for(Product product : prods)
        {
          System.out.println(product);
        }
    }
}