package Implementations.SnakeAndLadder.Strategies;

public class Points {
    private int start;
    private int end;

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    private Points(Points.builder builder){
        this.start = builder.start;
        this.end = builder.end;
    }

    public static class builder{

        private int start;
        private int end;

        public Points build(){
            return new Points(this);
        }

        public builder setStart(int start){
            this.start = start;
            return this;
        }

        public builder setEnd(int end){
            this.end = end;
            return this;
        }

    }

}
