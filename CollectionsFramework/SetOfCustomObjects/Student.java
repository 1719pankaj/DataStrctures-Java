package DataStructures.CollectionsFramework.SetOfCustomObjects;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollNo=" + rollNo + '}';
    }

    //Problem ye tha ki ek object ke parameters Set dekh nahi sakta
    //Tooo, object ka naam dekh leta tha aur wo har 2 object ka aag hota hai bhale parameters same ho
    //To set me ek hi item 2 bar aa jata tha

    //Set value ko add karne ke pahle equals() method call karta hai
    //Check kar ne ke liye ki item hai pahle se ya nahi
    //Aur har bar hi alag aata hai kyuki object ka naam hamesha alag hi hoga

    //Ab apan ko equals ko override kar ke modify karna hai aur apna code pass karna hai
    //Ye likha hai object ko equals mat kar rollnumber ko equals kar
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    //Aur ye wale override me likha hai object ke naam ka hash nahi bana
    //roll number ka hash bana
    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }


    //Collections class ke help se sort karna hai aur uske liye comparable implement karna hai
    //Basically ab Sort karoge to ye roll ka diffrence return karega negetive hua to order galat
    //Positive hua to NEXT!!
    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
    //👆👆Ye wala kuch palle nahi para
}
