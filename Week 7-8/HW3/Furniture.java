public interface Furniture {
    double getSize();
    double accept(ShippingCostVisitor visitor);
}