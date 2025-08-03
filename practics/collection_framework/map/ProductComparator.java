package practics.collection_framework.map;

import java.util.Comparator;

public class ProductComparator implements Comparator<ProductModel> {

    @Override
    public int compare(ProductModel o1, ProductModel o2) {
        if (o1 instanceof ProductModel && o1 instanceof  ProductModel){
            ProductModel model=(ProductModel) o1;
            ProductModel model2=(ProductModel) o2;

           return o1.getName().compareTo(o2.getName());
        }

        return 0;
    }
    
}
