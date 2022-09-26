package Unit3_Booleans_If_Statements;

public class StudentEx {
    private String fName;
    private String lName;
    private int idNum;

    public StudentEx(String fName, String lName, int idNum){
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public boolean equals(StudentEx other){
        boolean first = this.getfName().equals(other.getfName());
        boolean last = this.getlName().equals(other.getlName());
        if (first && last){
            return true;
        }
        else {
            return false;
        }
    }
    public int compareTo(StudentEx other){
        if (this.getlName().compareTo(other.getlName()) == 0){
            return this.getfName().compareTo(other.getfName());
        }
        else {
            return this.getlName().compareTo(other.getlName());
        }
    }
}
