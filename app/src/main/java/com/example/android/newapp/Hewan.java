package com.example.android.newapp;

/**
 * Created by lindakhny on 04/05/2017.
 */

public class Hewan {
    int jmlKaki;

    public Hewan(int i) {
    }

    public void setJmlKaki(int maxAlatGerak) {
        maxAlatGerak = 4;
        if(maxAlatGerak > jmlKaki){
            jmlKaki = maxAlatGerak;
        }
    }
    public int getJmlKaki (){
        return jmlKaki;
    }
}
