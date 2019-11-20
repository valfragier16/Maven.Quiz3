package rocks.zipcode.io.quiz3.collections;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    // encapsulate and manage a composite List of Lab objects.
    List<Lab> labs;

    // Nullary constructor
    public Student() {
        labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }
    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (labName.equals(lab.getName())) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (getLab(labName) != null ){
            getLab(labName).setStatus(labStatus);
        } else {
            throw new UnsupportedOperationException("Lab not forked");
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = labs.size() - 1; i >= 0; i--) {
            s += labs.get(i).toString();
            if(i != 0) {
                s += "\n";
            }
        }
        return s;
    }
}
