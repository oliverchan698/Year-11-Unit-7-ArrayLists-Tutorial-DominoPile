import java.util.ArrayList;

public class DominoPile {
    private ArrayList<String> pile;
    
    public DominoPile() {
        this.pile = new ArrayList<String>();
    }
    
    public ArrayList<String> otString() {
        return this.pile;
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if (j >= i) {
                    pile.add(new Domino(i, j).toString());
                }
            }
        }
    }

    public void shuffle() {
        ArrayList<String> newPile = new ArrayList<String>();
        final int size = this.pile.size();
        for (int i = 0; i < size; i++) {
            int index = (int) (Math.random() * this.pile.size());
            newPile.add(this.pile.get(index));
            this.pile.remove(index);
        }
        this.pile = newPile;
    }

}
