package map;

@SuppressWarnings("rawtypes")
public class ProductModel  implements Comparable{
    private int id;
    private String name;
    private float price;
    public ProductModel() {
    }
    public ProductModel(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
    @Override
    public String toString() {
        return "ProductModel [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof ProductModel){
            ProductModel model=(ProductModel) obj;
            if(this.id > model.id){
                return 1;
            }
           if (this.id < model.id){
            return -1;
           }

        }
        return 0;
    }
    


    /* 
    @Override
    public int compareTo(ProductModel o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
        */

    

}
