package com.quintus.labs.expandablenavigationdrawer.navigation;

/*Created by: Quintus Labs
  *www.quintuslabs.com
  *Created On: 27/04/2018*/

public class BaseItem {
    private String mName;
    private int icon;

    public BaseItem(String mName, int icon) {
        this.mName = mName;
        this.icon = icon;
    }

    public BaseItem(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public int getIcon() {
        return icon;
    }

}
