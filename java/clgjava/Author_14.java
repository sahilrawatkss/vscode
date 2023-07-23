//package clgjava;
//
//public class Author {
//    String name;
//    String mail;
//    char gender;
//    Author(String name,String mail,char gender)
//    {
//        this.gender=gender;
//        this.name=name;
//        this.mail=mail;
//    }
//}
//
//class Book
//{
//    String name;
//    Author author;
//    double price;
//    int qtyInStock;
//    Book(String name,Author author,double price,int qtyInStock)
//    {
//        this.name=name;
//        this.price=price;
//        this.qtyInStock=qtyInStock;
//    }
//    public String toString()
//    {
//
//    }
//}
//
//class Main
//{
//    public static void main(String[] args) {
//        Author author=new Author("J.K Rowling","J.K@gmail.com",'F');
//        Book obj=new Book("Harry Potter",author,3000,50);
//        System.out.println(obj.author.name);
//    }
//}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;

    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyStock;

    public Book(String name, Author author, double price, int qtyStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyStock = qtyStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyStock() {
        return qtyStock;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyStock(int qtyStock) {
        this.qtyStock = qtyStock;
    }
}
public class Author_14 {
    public static void main(String[] args) {
        Author author = new Author("Kathy Sierra", "kathysierra@email.com", 'F');
        Book book = new Book("Head First Java ", author, 400, 50);

        System.out.println("Book Name: " + book.getName());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyStock());
    }
}

