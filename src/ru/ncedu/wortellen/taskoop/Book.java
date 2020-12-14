package ru.ncedu.wortellen.taskoop;

public class Book {
    private final String name;

    private final Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name,Author[] authors,double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name,Author[] authors,double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Book[name="+name+",authors={");
        for(Author i:authors){
            sb.append("Author[name=");
            sb.append(i.getName());
            sb.append(",email=");
            sb.append(i.getEmail());
            sb.append(",gender=");
            sb.append(i.getGender());
            sb.append("],");
        }
        return sb.substring(0,sb.length()-1)+"},price="+price+",qty="+qty+"]";
    }

    public String getAuthorNames(){
        StringBuilder sb = new StringBuilder();
        for(Author i:authors){
            sb.append(i.getName());
            sb.append(',');
        }
        return sb.substring(0,sb.length()-1);
    }
}
 class Author{
     private final String name;
     private final String email;
     private final char gender;
     public Author(String name, String email, char gender){
         this.name=name;
         this.email=email;
         this.gender=gender;
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


}
