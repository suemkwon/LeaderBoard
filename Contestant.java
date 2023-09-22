class Contestant implements Comparable<Contestant> {
    private String name;
    private int score;

    // constructor: creates a new contestant with name and score
    public Contestant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // return the name
    public String getName() {
        return name;
    }

    // return the score
    public int getScore() {
        return score;
    }
    
    
    @Override // child class method over-write its base class method

    // implemets compareTo()
    public int compareTo(Contestant other) {
        if (this.score == other.score) {
            return 0;
        }
        return this.score - other.score;
    }


    @Override // child class method over-write its base class method

    // implements toString()
    public String toString() {
        return name + ": " + score; // return string: "<name>: <score>""
    }
}