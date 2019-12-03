package ru.job4j.pojo;

public class Shop {
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; (i + 1) < products.length; i++) {
                products[i] = products[i + 1];
                products[i + 1] = null;
        } return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        Shop shop = new Shop();

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 0 и сдвигаем все элементы массива ");
        //удаляем значение из ячейки с индексом 0 и сдвигаем все элементы массива
        shop.delete(products, 0);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
