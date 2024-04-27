// Gavin Perry, 2024-4-14, The purpose of this program is to declare an array of item products, and implement methods to sort them using insertion sort
public class ItemTester {
    public static void main(String[] args) {
        // Array of 10 item products
        Item[] items = {
            new Item("Apple", 0.99, 10, 1),
            new Item("Strawberry", 3.99, 4, 7),
            new Item("Grape", 1.99, 5, 4),
            new Item("Pineapple", 2.99, 3, 5),
            new Item("Orange", 0.79, 15, 3),
            new Item("Banana", 0.59, 20, 2),
            new Item("Watermelon", 4.99, 2, 6),
            new Item("Raspberry", 6.99, 1, 9),
            new Item("Blackberry", 7.99, 1, 10),
            new Item("Blueberry", 5.99, 1, 8),
        };

        System.out.println("Original Array:");
        displayItems(items);

        // Sort arrays and display them
        System.out.println("\nSorted by Product Number (Ascending):");
        Item[] sortedByProductNumberAsc = sortByProductNumber(items, true);
        displayItems(sortedByProductNumberAsc);
        
        System.out.println("\nSorted by Product Name (Descending):");
        Item[] sortedByProductNameDesc = sortByProductName(items, false);
        displayItems(sortedByProductNameDesc);

        System.out.println("\nSorted by Price (Ascending):");
        Item[] sortedByPriceAsc = sortByPrice(items, true);
        displayItems(sortedByPriceAsc);

        System.out.println("\nSorted by Quantity (Descending):");
        Item[] sortedByQuantityAsc = sortByQuantity(items, false);
        displayItems(sortedByQuantityAsc);
        
    }

    public static void displayItems(Item[] items) {
        System.out.println("+-----------------+----------+------------+----------+");
        System.out.println("|   Product Name  |  Price   |  Quantity  | Prod. No.|");
        System.out.println("+-----------------+----------+------------+----------+");
        for (Item item : items) {
            System.out.printf("| %-15s | $%7.2f | %10d | %8d |\n", item.getName(), item.getPrice(), item.getQuantity(), item.getProductNumber());
        }
        System.out.println("+-----------------+----------+------------+----------+");
    }
    
    public static Item[] sortByProductNumber(Item[] items, boolean ascending) {
        for (int i = 1; i < items.length; i++) {
            Item key = items[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? items[j].getProductNumber() > key.getProductNumber() : items[j].getProductNumber() < key.getProductNumber())) {
                items[j + 1] = items[j];
                j = j - 1;
            }
            items[j + 1] = key;
        }
        return items;
    }

    public static Item[] sortByProductName(Item[] items, boolean ascending) {
        for (int i = 1; i < items.length; i++) {
            Item key = items[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? items[j].getName().compareTo(key.getName()) > 0 : items[j].getName().compareTo(key.getName()) < 0)) {
                items[j + 1] = items[j];
                j = j - 1;
            }
            items[j + 1] = key;
        }
        return items;
    }

    public static Item[] sortByPrice(Item[] items, boolean ascending) {
        for (int i = 1; i < items.length; i++) {
            Item key = items[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? items[j].getPrice() > key.getPrice() : items[j].getPrice() < key.getPrice())) {
                items[j + 1] = items[j];
                j = j - 1;
            }
            items[j + 1] = key;
        }
        return items;
    }

    public static Item[] sortByQuantity(Item[] items, boolean ascending) {
        for (int i = 1; i < items.length; i++) {
            Item key = items[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? items[j].getQuantity() > key.getQuantity() : items[j].getQuantity() < key.getQuantity())) {
                items[j + 1] = items[j];
                j = j - 1;
            }
            items[j + 1] = key;
        }
        return items;
    }
}
