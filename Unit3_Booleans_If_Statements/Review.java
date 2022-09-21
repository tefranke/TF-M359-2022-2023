package Unit3_Booleans_If_Statements;

public class Review {
    // instance variables
    private String revName;
    private String busName;
    private int rating;

    // constructors
    public Review(String revName, String busName, int rating){
        this.revName = revName;
        this.busName = busName;
        this.rating = rating;
    }

    // getters and setters

    public String getRevName() {
        return revName;
    }

    public void setRevName(String revName) {
        this.revName = revName;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // methods

    public String toString(){
        String output = revName + ", " + busName + ", " + rating;

        if(this.rating == 5){
            output += "\n\t** Highly Recommended";
        }
        if(this.rating == 1){
            output += "\n\t** Strongly Discouraged";
        }
        return output;
    }
}
