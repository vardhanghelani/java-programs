import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of publications: ");
        int n = scanner.nextInt();
        Publication[] publications = new Publication[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the type of publication (1 for book, 2 for paper): ");
            int type = scanner.nextInt();
            System.out.println("Enter the author's name: ");
            String authorName = scanner.next();
            System.out.println("Enter the title: ");
            String title = scanner.next();
            if (type == 1) {
                publications[i] = new BookPublication(authorName, title);
            } else if (type == 2) {
                publications[i] = new PaperPublication(authorName, title);
            } else {
                System.out.println("Invalid publication type."); 
                return;
            }
        }
        System.out.println("Enter the author's name to display publications: ");
        String authorName = scanner.next();
        for (Publication publication : publications) {
            if (publication.getAuthorName().equals(authorName)) {
                System.out.println(publication);
            }
        }
    }
}

 class Publication {
    private String authorName;
    private String title;

    public Publication(String authorName, String title) {
        this.authorName = authorName;
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Author: " + authorName + ", Title: " + title;
    }
}

class BookPublication extends Publication {
    public BookPublication(String authorName, String title) {
        super(authorName, title);
    }
}

class PaperPublication extends Publication {
    public PaperPublication(String authorName, String title) {
        super(authorName, title);
    }
}