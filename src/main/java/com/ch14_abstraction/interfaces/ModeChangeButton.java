package com.ch14_abstraction.interfaces;

public class ModeChangeButton extends Button {
    private boolean mode;
    private int modeChange = 0;
    @Override
    public void onPressed() {
        mode = !mode;
        System.out.println( ((!mode) ? "냉방" : "난방") + "으로 바뀝니다.");
    }

    public void modeChange() {
        modeChange++;
        if (modeChange == 1){
            System.out.println("제습으로 바뀝니다.");
        } else if(modeChange == 2){
            System.out.println("난방으로 바뀝니다.");
        } else if(modeChange == 3){
            System.out.println("냉방으로 바뀝니다.");
        } else if(modeChange == 4){
            System.out.println("자동으로 바뀝니다.");
        } else if(modeChange == 5){
            System.out.println("송풍으로 바뀝니다.");
            modeChange = 0;
        }
    }
}
