package loanItems;

import java.util.ArrayList;

public abstract class LoanItem {
    private String name;

    LoanItem(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
