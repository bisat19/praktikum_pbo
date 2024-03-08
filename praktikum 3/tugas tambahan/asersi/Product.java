//Nama :  Abisatya Hastarangga Pradana
//NIM  : 24060122120004
//Tgl  : 6 Mar 2024
//Membuat kelas product dan asersinya


public class Product {
    private String name;
    private int stock;
    private int price;

    public Product() {
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        assert !name.isEmpty() : "Nama tidak boleh kosong";
        this.name = name;
    }

    public void setStock(int stock) {
        assert stock >= 0 : "Stock harus bilangan positif";
        this.stock = stock;
    }

    public void setPrice(int price) {
        assert price >= 0 : "Price harus bilangan positif";
        this.price = price;
    }

    public void purchaseProduct(int quantity) {
        assert quantity > 0 : "Quantity harus bilangan positif";
        assert quantity <= stock : "Stock tidak mencukupi";
        stock -= quantity;
    }

    public void addStock(int quantity) {
        assert quantity > 0 : "Quantity harus bilangan positif";
        stock += quantity;
    }
}
