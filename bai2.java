import java.util.Scanner;

public class bai2 {

    public abstract class Product {

        protected String productId;    
        protected String productName;  
        protected double productPrice; 
        protected int productTotal;    
    
        public Product() {}
    
        public Product(String productId, String productName, double productPrice, int productTotal) {
            this.productId = productId;
            this.productName = productName;
            this.productPrice = productPrice;
            this.productTotal = productTotal;
        }
    
        public String getProductId() {
            return productId;
        }
    
        public void setProductId(String productId) {
            this.productId = productId;
        }
    
        public String getProductName() {
            return productName;
        }
    
        public void setProductName(String productName) {
            this.productName = productName;
        }
    
        public double getProductPrice() {
            return productPrice;
        }
    
        public void setProductPrice(double productPrice) {
            this.productPrice = productPrice;
        }
    
        public int getProductTotal() {
            return productTotal;
        }
    
        public void setProductTotal(int productTotal) {
            this.productTotal = productTotal;
        }
    
        public abstract double getTotalPrice();
    
        @Override
        public String toString() {
            return "Product ID: " + productId +
                   ", Name: " + productName +
                   ", Price: " + productPrice +
                   ", Total: " + productTotal;
        }
    }
    
    class sanpham extends Product {
    
        public sanpham(String productId, String productName, double productPrice, int productTotal) {
            super(productId, productName, productPrice, productTotal);
        }
    
        @Override
        public double getTotalPrice() {
            return this.productPrice * this.productTotal;
        }
    }
    public static void main(String[] args) {
        bai2 outer = new bai2();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("hay nhap Product ID: ");
        String productId = scanner.nextLine();
        
        System.out.print("hay nhap Product Name: ");
        String productName = scanner.nextLine();
        
        System.out.print("hay nhap Product Price: ");
        double productPrice = scanner.nextDouble();
        
        System.out.print("hay nhap Product Total: ");
        int productTotal = scanner.nextInt();
        
        sanpham product = outer.new sanpham(productId, productName, productPrice, productTotal);
        
        System.out.println(product);
        System.out.println("Total Price: " + product.getTotalPrice());
        
        scanner.close();
    }
}
