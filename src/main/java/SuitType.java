public enum SuitType {
    SPADE(3,"Spade"),
    HEART(2, "Heart"),
    DIAMOND(1, "Diamond"),
    CLUB(0,"Club");

    private final int rank;  // final = can't change after initial setting
    private final String name;

    SuitType(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public int getRank(){
        return this.rank; //passed cards rank
    }
}//class


