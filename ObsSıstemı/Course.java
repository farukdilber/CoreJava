package ObsSýstemý;

import java.util.ArrayList;

public class Course {
String name;
String prefix;
int note;
Teacher ogretmen;
public ArrayList<Teacher> ogretmenList = new ArrayList<>();

Course(){
	
}
void addTeacher(Teacher ogretmen) {
	
	Course c1 = new Course(); 
	if (c1.prefix.equals(ogretmen.getBranch())) {
		System.out.println(c1.name+" dersine "+ogretmen.getName()+" hoca atandi");
	}
}
void printTeacher() {
	
}
}