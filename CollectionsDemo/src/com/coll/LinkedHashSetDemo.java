package com.coll;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        HashSet<Student> set = new LinkedHashSet<>();
        for(int i=0;i<2;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            Student st = new Student(a,b,c);
            set.add(st);
        }
        for(Student s:set) {
        	System.out.println(s.name);
        	System.out.println(s.city);
        }
        
//        set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
	}

}
class Student{
    String name;
    int id;
    String city;
    
    public Student(int id, String name, String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }
//    @Override
//    public boolean equals(Object obj) {
//    	if(this == obj) return true;
//    	if(obj == null || getClass() != obj.getClass()) return false;
//    	Student student = (Student) obj;
//    	return id == student.id && name.equals(student.name) && city.equals(student.city);
//    		
//    }
//    @Override
//    public int hashCode() {
//    	int result = Integer.hashCode(id);
//    	result = 31 * result + name.hashCode();
//    	result = 31 * result + city.hashCode();
//    	return result;
//    }
}
