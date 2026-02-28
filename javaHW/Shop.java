public class Shop {

    private Product[] products;
    private int size = 0;

    public Shop(int capacity){
        products = new Product[capacity];
    }

    public void addProduct(String name, int price){
        if(size >= products.length){
            System.out.println("Catalog full");
            return;
        }

        products[size] = new Product(name, price);
        size++;
    }

    public void printAll(){
        if(size == 0){
            System.out.println("Catalog empty");
            return;
        }

        for(int i = 0; i < size; i++){
            products[i].print();
        }
    }

    public Product findById(int id){
        for(int i = 0; i < size; i++){
            if(products[i].getId() == id){
                return products[i];
            }
        }
        return null;
    }

    public boolean removeById(int id){
        for(int i = 0; i < size; i++){
            if(products[i].getId() == id){

                for(int j = i; j < size - 1; j++){
                    products[j] = products[j + 1];
                }

                products[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean updatePriceById(int id, int newPrice){
        Product p = findById(id);
        if(p == null) return false;

        p.setPrice(newPrice);
        return true;
    }

    public int countProducts(){
        return size;
    }

    public void clear(){
        for(int i = 0; i < size; i++){
            products[i] = null;
        }
        size = 0;
    }
}
