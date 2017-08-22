/*
Created by ChrisChan on 2017/8/22.
*/
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeMenu, dinerMenu);
        waitress.printMenu();
    }
}
