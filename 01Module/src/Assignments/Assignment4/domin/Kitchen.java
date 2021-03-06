/*
*
Timur Plavnik 108020258018
Aiyana Erbe   108020267357
Shipan Liu    108019201553
*
* */

package Assignments.Assignment4.domin;

public class Kitchen extends Room {
    private boolean stove;

    public Kitchen(String name, boolean lighting, boolean stove) {
        super(name, lighting);
        this.stove = stove;
    }

    public boolean getStove() {
        return stove;
    }

    public void setStove(boolean stove) {
        this.stove = stove;
    }

    public void switchStove() {
        stove = stove ? false : true;
    }
}
