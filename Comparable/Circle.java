
public class Circle implements Comparable{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }

    @Override
    public int compareTo(Object o) {
        Circle c=(Circle)o;
        return radius-c.radius;
    }

    
    @Override
    public String toString() {
        return "Circle[radius:"+radius+"]";
    }
}
