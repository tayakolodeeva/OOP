package sem_1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("potatoes", 120, Types.VEGETABLE));
        vm.addProduct(new Product("carrots", 100, Types.VEGETABLE));
        vm.addProduct(new Product("cabbage", 80, Types.VEGETABLE));
        vm.addProduct(new Product("squash", 110, Types.VEGETABLE));
        vm.addProduct(new Drink("Coca-Cola", 40, 0.5, Types.SODA));
        vm.addProduct(new Drink("Dr. Pepper", 50, 0.5, Types.SODA));
        vm.addProduct(new Drink("Sprite", 80, 1, Types.SODA));
        vm.addProduct(new Drink("A&W Root Beer", 60, 0.5, Types.BEER));
        vm.addProduct(new Chocolate("Milka", 40, 50, Types.CHOCOLATE));
        vm.addProduct(new Chocolate("Nesquik", 40, 50, Types.CHOCOLATE));
        vm.addProduct(new Chocolate("Аленка", 40, 50, Types.CHOCOLATE));
        vm.addProduct(new Chocolate("Nestle", 40, 50, Types.CHOCOLATE));

        System.out.println(vm);
        System.out.println(vm.getProductByName("Nestle"));
        vm.buy("Sprite", 80.0);
        System.out.println("Sprite");
        System.out.println(vm.getMoney()); 

    }
    
}
