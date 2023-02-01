public class NodePageTable {
    int hasValue;
    int numberFrame;
            // &&&&&&&&&&&&&&&&&&&& Constructor
            // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    public NodePageTable(int hasValue,int numberFrame) {
        this.hasValue = hasValue;
        this.numberFrame = numberFrame;
    }
                    // ******************************************
                    // **************** Getter & Setter
                    // ******************************************
    public int getHasValue() {
        return hasValue;
    }

    public void setHasValue(int hasValue) {
        this.hasValue = hasValue;
    }

    public int getNumberFrame() {
        return numberFrame;
    }

    public void setNumberFrame(int numberFrame) {
        this.numberFrame = numberFrame;
    }
}
