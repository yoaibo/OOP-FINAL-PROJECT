import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Property {
    private int id;
    private String location;
    private double value;
    private boolean isDamaged;
    private static int totalProperties = 0;

    public Property(int id, String location, double value) {
        this.id = id;
        this.location = location;
        this.value = value;
        this.isDamaged = false;
        totalProperties++;
    }

    public int getId() { return id; }
    public String getLocation() { return location; }
    public double getValue() { return value; }
    public boolean getIsDamaged() { return isDamaged; }
    
    public void setIsDamaged(boolean isDamaged) { 
        this.isDamaged = isDamaged; 
    }

    public static int getTotalProperties() {
        return totalProperties;
    }

    public String getDescription() {
        return "Property ID: " + id + " at " + location + " (Value: $" + value + ")";
    }

    public void saveLog(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pms_log.txt", true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error saving log: " + e.getMessage());
        }
    }
}