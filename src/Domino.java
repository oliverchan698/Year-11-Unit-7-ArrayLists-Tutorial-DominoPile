public class Domino { // Dameeno
    private int top;
    private int bottom;

    public Domino() {
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return this.top;
    }

    public int getBottom() {
        return this.bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString() {
        return this.top + "/" + this.bottom;
    }

    public void flip() {
        int temp = this.top;
        this.top = bottom;
        this.bottom = temp;
    }

    public void settle() {
        if (top > bottom) {
            flip();
        }
    }

    public int compareTo(Domino enemy) {
        settle();
        enemy.settle();
        if (this.top < enemy.getTop()) {
            return -1;
        } else if (this.top > enemy.getTop()) {
            return 1;
        } else {
            if (this.bottom < enemy.getBottom()) {
                return -1;
            } else if (this.bottom > enemy.getBottom()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino enemy) {
        int myTotal = this.top + this.bottom;
        int enemyTotal = enemy.getTop() + enemy.getBottom();
        if (myTotal < enemyTotal) {
            return -1;
        } else if (myTotal > enemyTotal) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean canConnect(Domino friend) { // I like what I did there
        return this.top == friend.top || this.bottom == friend.bottom || this.top == friend.bottom || this.bottom == friend.top;
    }

}
