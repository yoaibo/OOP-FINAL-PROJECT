public class Tenant extends User {

    public Tenant(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Tenant: " + getName());
    }

    public void rentProperty(Property p) {
        System.out.println("Tenant " + getName() + " leased property " + p.getId());
        p.saveLog("Property " + p.getId() + " rented to Tenant " + getName());
    }
}