package mark35Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Electrical {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Inventory arr[] = new Inventory[4];

        // Input for 4 inventory items
        for (int i = 0; i < arr.length; i++) {
            int a = scan.nextInt();
            scan.nextLine();
            int b = scan.nextInt();
            scan.nextLine();
            int c = scan.nextInt();
            scan.nextLine();
            int d = scan.nextInt();
            arr[i] = new Inventory(a, b, c, d);
        }

        int limit = scan.nextInt();
        Inventory[] arr2 = replenish(arr, limit);

        // Categorize and print based on threshold
        for (Inventory inventory : arr2) {
            if (inventory.getThreshold() > 75) {
                System.out.println(inventory.getInventoryId() + " Critical Filling");
            } else if (inventory.getThreshold() >= 50) {
                System.out.println(inventory.getInventoryId() + " Moderate Filling");
            } else {
                System.out.println(inventory.getInventoryId() + " Non-Critical Filling");
            }
        }

        // Close the scanner to prevent resource leak
        scan.close();
    }

    // Function to find items to replenish based on limit
    public static Inventory[] replenish(Inventory arr[], int limit) {
        Inventory[] arr2 = new Inventory[0];
        for (Inventory inventory : arr) {
            if (inventory.getThreshold() <= limit) {
                arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                arr2[arr2.length - 1] = inventory;
            }
        }
        return arr2;
    }
}

// Inventory class to hold inventory details
class Inventory {
    private int inventoryId;
    private int maxQuantity;
    private int currentQuantity;
    private int threshold;

    public Inventory(int inventoryId, int maxQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maxQuantity = maxQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }
}
