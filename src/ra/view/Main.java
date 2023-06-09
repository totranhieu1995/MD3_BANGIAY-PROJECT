package ra.view;

import static ra.config.Config.scanner;

public class Main {

    public static void generalShop() {
        while (true) {
            System.out.println("********** WELCOME TO SHOP HIEUHOA SPORT **********");
            System.out.println("1. Show Product");
            System.out.println("2. Register");
            System.out.println("3. Login");
            System.out.println("4. Exit");
            int choiceMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceMenu) {
                case 1:
                    new ProductView().ShowProduct();
                    break;
                case 2:
                    new UserView().register();
                    break;
                case 3:
                    new UserView().formLogin();
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    public static void generalManager() {
        boolean check = true;
        while (check) {
            System.out.println("********** GENERAL MANAGEMENT ********** \n");
            System.out.println("1. Product Management");
            System.out.println("2. Catalog Management");
            System.out.println("3. User Management");
            System.out.println("4. Oder Management");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductView.ProductManagement();
                    break;
                case 2:
                    CatalogView.catalogManager();
                    break;
                case 3:
                    new UserView().showListUser();
                    break;
                case 4:
                    new OderView().oderManagement();
                    break;
                case 5:
                    new UserView().logOut();
                    check = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main.generalShop();
    }

    public void viewUser() {
        boolean check = true;
        while (check) {
            System.out.println("********** WELCOME TO SHOP HIEUHOA SPORT **********");
            System.out.println("1. Show Product");
            System.out.println("2. Add To Cart");
            System.out.println("3. Show your Cart");
            System.out.println("4. Update user");
            System.out.println("5. Show Oder History");
            System.out.println("6. LogOut");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    new ProductView().ShowProduct();
                    break;
                case 2:
                    new CartView().addToCart();
                    break;
                case 3:
                    new CartView().showCart();
                    showMyCart();
                    break;
                case 4:
                    new UserView().updateUser();
                    break;
                case 5:
                      new OderView().showOderHistory();
                      break;
                case 6:
                    System.out.println("---------- Goodbye See you again! ----------");
                    new UserView().logOut();
                    check = false;
                default:
                    break;

            }
        }
    }
    public static void showMyCart(){
        System.out.println("********** YOUR CART **********");
        boolean check = true;
        while (check){
            System.out.println("1. Buy");
            System.out.println("2. Update Cart");
            System.out.println("3. Delete Cart Item");
            System.out.println("4. Delete All Item");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    new OderView().createOder();
                    new OderView().showOderMenu();
                    break;
                case 2:
                    new CartView().updateCart();
                    break;
                case 3:
                    new CartView().deleteItem();
                    break;
                case 4:
                    new CartView().deleteAllCart();
                    break;
                case 5:
                    check = false;
                    break;
                default:
                    System.err.println("Incorrect, please re-enter");
                    break;
            }
        }
    }
}