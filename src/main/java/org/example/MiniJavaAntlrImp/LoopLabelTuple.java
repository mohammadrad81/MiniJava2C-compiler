package org.example.MiniJavaAntlrImp;

public class LoopLabelTuple {
    private String loopStartLabel;
    private String loopEndLabel;


    public LoopLabelTuple(String loopStartLabel, String loopEndLabel) {
        this.loopEndLabel = loopEndLabel;
        this.loopStartLabel = loopStartLabel;
    }

    public String getLoopStartLabel() {
        return loopStartLabel;
    }

    public void setLoopStartLabel(String loopStartLabel) {
        this.loopStartLabel = loopStartLabel;
    }

    public String getLoopEndLabel() {
        return loopEndLabel;
    }

    public void setLoopEndLabel(String loopEndLabel) {
        this.loopEndLabel = loopEndLabel;
    }
}
