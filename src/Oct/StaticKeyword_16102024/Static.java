package Oct.StaticKeyword_16102024;

public class Static {
    public static void main(String[] args) {
        Student s1= new Student(23) ;
        Student s2=new Student(25);
        System.out.println(s1);
        System.out.println(s2);

    }
    }
    class Student {
        int age;
        static String school_name;
        static String course_name;

        public Student(int age) {
            this.age = age;
        }
    }
