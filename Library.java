package Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Library {


		 private static ArrayList<String> bookTitles = new ArrayList<>();

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("Library System Menu:");
		            System.out.println("1. Add a Book Title");
		            System.out.println("2. Remove a Book Title");
		            System.out.println("3. Search for a Book Title");
		            System.out.println("4. List All Book Titles");
		            System.out.println("5. Sort Book Titles");
		            System.out.println("6. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();
		            scanner.nextLine();
		            switch (choice) {
		                case 1:
		                    addBookTitle(scanner);
		                    break;
		                case 2:
		                    removeBookTitle(scanner);
		                    break;
		                case 3:
		                    searchBookTitle(scanner);
		                    break;
		                case 4:
		                    listBookTitles();
		                    break;
		                case 5:
		                    sortBookTitles();
		                    break;
		                case 6:
		                    System.out.println("Exiting the system.");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 6);

		        scanner.close();
		    }

		    private static void addBookTitle(Scanner scanner) {
		        System.out.print("Enter the book title to add: ");
		        String title = scanner.nextLine();
		        bookTitles.add(title);
		        System.out.println("Book title added.");
		    }

		    private static void removeBookTitle(Scanner scanner) {
		        System.out.print("Enter the book title to remove: ");
		        String title = scanner.nextLine();
		        if (bookTitles.remove(title)) {
		            System.out.println("Book title removed.");
		        } else {
		            System.out.println("Book title not found.");
		        }
		    }

		    private static void searchBookTitle(Scanner scanner) {
		        System.out.print("Enter the book title to search for: ");
		        String title = scanner.nextLine();
		        int index = bookTitles.indexOf(title);
		        if (index != -1) {
		            System.out.println("Book title found at index: " + index);
		        } else {
		            System.out.println("Book title not found.");
		        }
		    }

		    private static void listBookTitles() {
		        System.out.println("List of all book titles:");
		        for (String title : bookTitles) {
		            System.out.println(title);
		        }
		    }

		    private static void sortBookTitles() {
		        Collections.sort(bookTitles);
		        System.out.println("Book titles sorted alphabetically.");
		    }
        }


	


