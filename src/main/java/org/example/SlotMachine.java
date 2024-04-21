package org.example;

public class SlotMachine {
    private Reel[] columns;

    public SlotMachine(Reel[] columns){
        this.columns=columns;
    }

    public int[] startSpinning(){
        int[] result= new int[3];
        for(int i=0; i<3; i++){
            result[i]= columns[i].spin();
        }
        return result;
    }
}
