public class FurnitureShop {
    public static void main(String[] args) {
        Furniture Chair = new Chair(50.0);
        Furniture Table = new Table(100.0);
        Sofa Sofa = new Sofa(200.0); 

        ShippingCostVisitor costCalculator = new ShippingCostCalculator();

        System.out.println("Chair shipping cost: ₱" + Chair.accept(costCalculator));
        System.out.println("Table shipping cost: ₱" + Table.accept(costCalculator));
        System.out.println("Sofa shipping cost (default distance): ₱" + Sofa.accept(costCalculator));

        System.out.println("Sofa shipping cost (with 10 km): ₱" + Sofa.accept(costCalculator, 10));
    }
}