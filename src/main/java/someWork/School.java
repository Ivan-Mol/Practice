package someWork;

import java.util.ArrayList;

public class School<T extends Teacher> {
    ArrayList<T> teachers = new ArrayList<T>();

    public void addTeacher(T teacher){
        teachers.add(teacher);
    }


}
