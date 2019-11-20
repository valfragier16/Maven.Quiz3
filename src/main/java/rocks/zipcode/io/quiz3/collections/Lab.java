package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String name;
    private LabStatus labStatus;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.name = labName;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return this.labStatus;
    }

    @Override
    public String toString() {
        return name + " > " + labStatus.name();
    }

}
