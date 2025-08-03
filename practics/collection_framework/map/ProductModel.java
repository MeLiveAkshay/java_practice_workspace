package practics.collection_framework.map;

public class ProductModel implements Comparable<ProductModel>{
    private int id;
    private String name;
    private Float price;
    public ProductModel() {
    }
    public ProductModel(int id, String name, Float price) {
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
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product : [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    @Override
    public int compareTo(ProductModel model) {
        return this.id-model.id;
    }

}
