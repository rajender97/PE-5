import java.util.*;
public class PE5_4 {
    public static void main(String[] args) {
        str mn= new str();
        List<student> scan=mn.create();
        Collections.sort(scan,new studentSorter());
        for(int j=0;j<scan.size();j++)
        {
            System.out.println(scan.get(j));
        }
    }
}
class str
{
    public List<student> create()
    {
        List<student> s= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of stdents");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter id,name,age");
            student detail=new student();
            detail.setId(sc.nextInt());
            detail.setName(sc.next());
            detail.setAge(sc.nextInt());
            s.add(detail);
        }
        return s;
    }
}
class student
{
    private int id;
    private String name;
    private int age;
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class studentSorter implements Comparator<student> {
    @Override
    public int compare(student a, student b) {
        if(a.getAge()!=b.getAge())
            return b.getAge()-a.getAge();
        else if(a.getName() != b.getName())
            return a.getName().compareTo(b.getName());
        else
            return a.getId()-b.getId();
    }
}