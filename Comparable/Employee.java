public class Employee implements Comparable{
    int id;
    String name;
    double salary;
     Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Employee)o).name);
    }
    @Override
    public String toString() {
        return "Employee[Id:"+id+" Name:"+name+" Salary:"+salary+"]";
    }
}
