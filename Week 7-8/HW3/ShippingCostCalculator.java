public class ShippingCostCalculator implements ShippingCostVisitor {

    @Override
    public double visit(Chair chair) {
        return 50.0; 
    }

    @Override
    public double visit(Table table) {
        return table.getSize() * 20.0; 
    }

    @Override
    public double visit(Sofa sofa, double distance) {
        return sofa.getSize() * 30.0 + distance * 50.0;
    }
}