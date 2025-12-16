
 class Book{
    String tittle;
    String author;
 }
 class B{
    public static void main(String[] args) {
        Book b1=new Book();
        b1.tittle="Java";
        b1.author="James Gosling";
        System.out.println(b1.tittle+" "+b1.author);
        Book b2=new Book();
        b2.tittle="Richie Rich";
        b2.author="Ryan Gosling";
        System.out.println(b2.tittle+" "+b2.author);
    }
 }
