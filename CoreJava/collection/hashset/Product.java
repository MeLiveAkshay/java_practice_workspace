package collection.hashset;

public class Product
{
    private int id;
    private String name;
    private float price;
    private String category;

    public Product(){

    }

    public Product(int id, String name, float price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString()
    {
    return "{\n" +
           "  \"id\": " + id + ",\n" +
           "  \"name\": \"" + name + "\",\n" +
           "  \"price\": " + price + ",\n" +
           "  \"category\": \"" + category + "\"\n" +
           "}";
    }

    
    @Override
    public boolean equals(Object object)
    {
        if(object instanceof Product){
            Product p =(Product) object;

            if(this.id==p.id && this.name.equals(p.name) && this.price == p.price && this.category.equals(p.category))
            {
                return true;
            }
            
        }
        return false;
    }
    
    @Override
    public int  hashCode()
    {
        return id;
    }


    
    
}
