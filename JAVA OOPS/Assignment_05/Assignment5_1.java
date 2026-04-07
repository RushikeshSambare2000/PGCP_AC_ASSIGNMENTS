class Inventory<T> {
    private T product;

    // Add product
    public void addProduct(T product) {
        this.product = product;
    }

    // Retrieve product
    public T getProduct() {
        return product;
    }
}

class Electronics {
    String name;
    double price;

    Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Electronics [Name=" + name + ", Price=" + price + "]";
    }
}

class Clothing {
    String brand;
    String size;

    Clothing(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String toString() {
        return "Clothing [Brand=" + brand + ", Size=" + size + "]";
    }
}



public class Assignment5_1 {
    public static void main(String[] args) {

        // Electronics Inventory
        Inventory<Electronics> electronicInventory = new Inventory<>();
        Electronics laptop = new Electronics("Laptop", 75000);
        electronicInventory.addProduct(laptop);

        System.out.println("Electronics Product:");
        System.out.println(electronicInventory.getProduct());

        // Clothing Inventory
        Inventory<Clothing> clothingInventory = new Inventory<>();
        Clothing shirt = new Clothing("Nike", "L");
        clothingInventory.addProduct(shirt);

        System.out.println("\nClothing Product:");
        System.out.println(clothingInventory.getProduct());
    }
}