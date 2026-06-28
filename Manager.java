public class Manager extends User {
    
    public Manager(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Manager: " + getName());
    }

    public void assignProperty(Property p) {
        System.out.println("Manager " + getName() + " registered property " + p.getId());
        p.saveLog("Property " + p.getId() + " assigned by Manager " + getName());
    }
}