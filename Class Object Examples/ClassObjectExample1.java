
class Students {
    int rollNo, year;
    String name;

    public Students(int rollNo, int year, String name) {
        this.name = name;
        this.rollNo = rollNo;
        this.year = year;
    }


    public Students(){
        this.name = null;
        this.rollNo = 0;
        this.year = 0;
    }

    void display() {
        System.out.println("Name - " + name + "\n" + "Roll No. - " + rollNo + "\n" + "Year - " + year);
    }

}

public class ClassObjectExample1 {

    public static void main(String[] args) {
        
        Students s1 = new Students(10, 3, "Shodhan Shetty");
        Students s2 = new Students(20, 4, "Amodh Udupa");
        Students s3 = new Students();
       
       
        s1.display();
        s2.display();

        s3.name = "Tharun";
        s3.rollNo = 10;
        s3.year = 2;

        s3.display();
        
    }
}
