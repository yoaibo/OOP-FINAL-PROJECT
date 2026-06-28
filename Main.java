import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== PROPERTY MANAGEMENT SYSTEM ===");

        System.out.print("Enter Property ID: ");
        int propId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Property Location: ");
        String location = scanner.nextLine();

        System.out.print("Enter Property Value: ");
        double value = scanner.nextDouble();
        scanner.nextLine(); 

        Property flat = new Property(propId, location, value);

        System.out.print("\nEnter Manager Name: ");
        String mgrName = scanner.nextLine();
        User mgr = new Manager(1, mgrName);

        System.out.print("Enter Tenant Name: ");
        String tenantName = scanner.nextLine();
        User tenant = new Tenant(50, tenantName);

        System.out.print("Enter Inspector Name: ");
        String inspectorName = scanner.nextLine();
        User inspector = new Inspector(7, inspectorName);

        System.out.println("\n=== RUNNING ACTIONS ===");
        System.out.println(flat.getDescription());
        mgr.displayRole();
        tenant.displayRole();
        inspector.displayRole();

        System.out.println("\n--- Processing Actions ---");
        ((Manager) mgr).assignProperty(flat);
        ((Tenant) tenant).rentProperty(flat);
        
        System.out.print("\nEnter damage issue found by inspector: ");
        String issue = scanner.nextLine();
        ((Inspector) inspector).logDamage(flat, issue);

        System.out.println("\nTotal Registered Assets: " + Property.getTotalProperties());
        
        scanner.close();
    }
}