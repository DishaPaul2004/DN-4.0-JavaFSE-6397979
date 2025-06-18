import java.util.*;
class Product
{
    private int productId;
    private String productName,category;
    public Product(int productId,String productName,String category)
    {
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
    public void setProductId(int productId)
    {
        this.productId=productId;
    }
    public int getProductId()
    {
        return productId;
    }
    public void setProductName(String productName)
    {
        this.productName=productName;
    }
    public String getProductName()
    {
        return productName;
    }
    public void setCategory(String category)
    {
        this.category=category;
    }
    public String getCategory()
    {
        return category;
    }
}
class ECommerceSearch
{
    public static void linearSearch(Product[] products,int productId)
    {
        int flag=0;
        for(Product product : products)
        {
            if(product.getProductId()==productId)
            {
                flag=1;
                System.out.println("Product found, it is "+product.getProductName()+" and belongs to the category "+product.getCategory());
                break;
            }
        }
        if(flag==0)
        System.out.println("No such product found");
    }
    public static void binarySearch(Product[] products,int productId)
    {
        Arrays.sort(products,new Comparator<Product>(){
            public int compare(Product p1,Product p2)
            {
                return Integer.compare(p1.getProductId(),p2.getProductId());
            }
        });
        int flag=0,low=0,high=products.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            Product guess=products[mid];
            if(guess.getProductId()==productId)
            {
                flag=1;
                System.out.println("Product found, it is "+guess.getProductName()+" and belongs to the category "+guess.getCategory());
                break;
            }
            else if(guess.getProductId()<productId)
            low=mid+1;
            else
            high=mid-1;
        }
        if(flag==0)
        System.out.println("No such product found");
    }
    public static void display(Product[] products)
    {
        System.out.println("PRODUCTS LIST");
        for(Product product : products)
        {
            System.out.println("Product "+product.getProductId()+", "+product.getProductName()+" belonging to the category "+product.getCategory());
        }
    }
}
class Demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product[] products={new Product(1,"Sweater","Winter wear"),
                            new Product(2,"Scarf","Winter wear"),
                            new Product(3,"Suits","Formal wear"),
                            new Product(4,"Jacket","Winter wear"),
                            new Product(5,"Shirts","Formal wear")};
        ECommerceSearch.display(products);
        System.out.print("Enter the product ID for linear searching : ");
        int pID=sc.nextInt();
        ECommerceSearch.linearSearch(products,pID);
        System.out.print("Enter the product ID for binary searching : ");
        pID=sc.nextInt();
        ECommerceSearch.binarySearch(products,pID);
        sc.close();
    }
}
/*
OUTPUT
--------------------------------------------------------------------------
PRODUCTS LIST
Product 1, Sweater belonging to the category Winter wear
Product 2, Scarf belonging to the category Winter wear
Product 3, Suits belonging to the category Formal wear
Product 4, Jacket belonging to the category Winter wear
Product 5, Shirts belonging to the category Formal wear
Enter the product ID for linear searching : 4
Product found, it is Jacket and belongs to the category Winter wear
Enter the product ID for binary searching : 5
Product found, it is Shirts and belongs to the category Formal wear
 */