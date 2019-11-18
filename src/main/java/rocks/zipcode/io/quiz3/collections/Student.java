package rocks.zipcode.io.quiz3.collections;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    // encapsulate and manage a composite List of Lab objects.
    private Map<Lab, LabStatus> labs = new HashMap<>();
    Set set = labs.entrySet();

    // Nullary constructor
    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
    }
    public Lab getLab(String labName) {
        Iterator k = set.iterator();
        Lab value = null;
        while (k.hasNext()) {
            Map.Entry me = (Map.Entry) k.next();
            Lab lab = (Lab) me.getKey();

            if (labName.equals(lab.getName())) {
                value = lab;
            }
        }
        return value;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if (lab != null) {
            this.labs.put(lab, labStatus);
        } else {
            throw new UnsupportedOperationException("Lab not forked");
        }
    }

    public void forkLab(Lab lab) {
        this.labs.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        Lab lab = getLab(labName);
        return this.labs.get(lab);
    }

}
