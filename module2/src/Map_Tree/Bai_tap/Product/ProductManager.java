package Map_Tree.Bai_tap.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ProductManager {
    ArrayList<Product> listProduct = new ArrayList<Product>();
    Scanner scanner = new Scanner(System.in);
    private int choice;
    public void menu() {
        do {
            System.out.println("\n");
            System.out.println("Choice a action : ");
            System.out.println("==================================");
            System.out.println("1. Add product.");
            System.out.println("2. Update info by ID.");
            System.out.println("3. Delete product by ID.");
            System.out.println("4. Display list product.");
            System.out.println("5. Find product by name.");
            System.out.println("6. by name Sort products in ascending order by price.");
            System.out.println("7. by name Sort products in descending order by price.");
            System.out.println("8. Exit.");
            System.out.print("\n");
            System.out.print("Choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.print("\n");
        } while (choice <= 0 || choice > 8);

        switch (choice) {
            case 1: {
                addProduct();
                break;
            }
            case 2: {
                int id, newPrice = 0;
                String newName = "";
                System.out.print("Enter your ID : ");
                id = Integer.parseInt(scanner.nextLine());
                Product product = findId(id);
                if (product == null) {
                    System.out.print("There are no products you are looking for!");
                } else {
                    System.out.print("The name you want to update : ");
                    newName = scanner.nextLine();
                    System.out.print("The price you want to update : ");
                    newPrice = Integer.parseInt(scanner.nextLine());
                    product.setName(newName);
                    product.setPrice(newPrice);
                }
                menu();
                break;
            }
            case 3: {
                int id;
                System.out.print("Enter your ID : ");
                id = Integer.parseInt(scanner.nextLine());
                Product product = findId(id);
                listProduct.remove(product);
                menu();
                break;
            }
            case 4: {
                displayProduct();
                break;
            }
            case 5: {
                String name = "";
                System.out.print("Enter yor name : ");
                name = scanner.nextLine();
                findName(name);
                break;
            }
            case 6: {
                PriceComparator priceComparator = new PriceComparator();
                Collections.sort(listProduct, priceComparator);
                for (Product product : listProduct) {
                    System.out.println(product.toString());
                }
                menu();
                break;
            }
            case 7: {
                PriceComparator1 priceComparator1 = new PriceComparator1();
                Collections.sort(listProduct, priceComparator1);
                for (Product product : listProduct) {
                    System.out.println(product.toString());
                }
                menu();
                break;
            }
            case 8: {
                System.exit(0);
                break;
            }
        }
    }

    private void addProduct() {
        String name;
        int id = 0, price;
        if (listProduct.isEmpty()) {
            id = 0;
        } else {
            id = listProduct.get(listProduct.size()-1).getId() + 1; // lấy id product cuối cộng thêm 1
        }
        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        System.out.print("Enter your price : ");
        price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, price, name);
        listProduct.add(product);
        menu();
    }

    private void displayProduct() {
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
        menu();
    }

    private void findName(String name) {
        for (Product product : listProduct) {
            if (name.equals(product.getName())) {
                System.out.println(product.toString());
            }
        }
        menu();
    }

    private Product findId(int id) {
        for (Product product : listProduct) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


}
