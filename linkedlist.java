import java.util.LinkedList;
import java.util.Scanner;
public class linkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the elements of the linked list (separated by spaces, enter 'done' to finish):");
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            String[] elements = input.split(" ");
            for (String element : elements) {
                list.add(Integer.parseInt(element));
            }
            input = scanner.nextLine();
        }
        System.out.println("Original Linked List: " + list);
        System.out.println("Enter the operation you want to perform:");
        System.out.println("1. Add an element");
        System.out.println("2. Remove an element");
        System.out.println("3. Get element at a specific index");
        System.out.println("4. Check if the list is empty");
        System.out.println("5. Get the size of the list");
        System.out.println("6. Clear the list");
        System.out.println("7. Exit");
        int choice;
        do {
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to add:");
                    int elementToAdd = scanner.nextInt();
                    list.add(elementToAdd);
                    System.out.println("Element added successfully. Updated list: " + list);
                    break;
                case 2:
                    System.out.println("Enter the element to remove:");
                    int elementToRemove = scanner.nextInt();
                    if (list.remove(Integer.valueOf(elementToRemove))) {
                        System.out.println("Element removed successfully. Updated list: " + list);
                    } else {
                        System.out.println("Element not found in the list.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the index to get the element from:");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < list.size()) {
                        System.out.println("Element at index " + index + ": " + list.get(index));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.println("List is empty: " + list.isEmpty());
                    break;
                case 5:
                    System.out.println("Size of the list: " + list.size());
                    break;
                case 6:
                    list.clear();
                    System.out.println("List cleared successfully.");
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
