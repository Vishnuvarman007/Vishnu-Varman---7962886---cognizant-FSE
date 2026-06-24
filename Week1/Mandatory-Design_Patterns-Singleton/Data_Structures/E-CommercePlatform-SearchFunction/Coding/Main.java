public class Main{
    public static void main(String[] args) {
        Product[] products=new Product[3];
        products[0]=new Product(1,"Laptop","Electronics");
        products[1]=new Product(2,"Mobile","Electronics");
        products[2]=new Product(3,"TV","Electronics");
        BinarySearch obj1 = new BinarySearch();
        LinearSearch obj2 = new LinearSearch();
        System.out.println("Binary Search Method");
        System.out.println("Searching for Product Item 1: "+obj1.search(products, 1));
        System.out.println("Searching for Product Item 2: "+obj1.search(products, 2));
        System.out.println("Searching for Product Item 4: "+obj1.search(products, 4));

        System.out.println("Linear Search Method");
        System.out.println("Searching for Product Item 1: "+obj2.search(products, 1));
        System.out.println("Searching for Product Item 2: "+obj2.search(products, 2));
        System.out.println("Searching for Product Item 4: "+obj2.search(products, 4));

    }
}