
public class Book implements Comparable{
    String name;
    String author;
    double price;
    Book(String name,String author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    @Override
    public int compareTo(Object o) {
        if (price-((Book)o).price<0)
            return -1;
        if(price-((Book)o).price==0)
            return 0;
        return 1;
    }
    @Override
    public String toString() {
       
        return "Book[Name:"+name+" Author:"+author+" Price:"+price+"]";
    }
}
