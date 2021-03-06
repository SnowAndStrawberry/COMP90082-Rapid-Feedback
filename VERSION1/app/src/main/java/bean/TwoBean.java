/**
 * Created by: Android frontend team
 *
 * Team Member: Wang AN, NingJiang XIE
 */

package bean;

import android.widget.Checkable;


public class TwoBean implements Checkable {


    private String title;


    private boolean isChecked;



    public TwoBean() {
    }

    public TwoBean(Boolean checked, String title) {
        isChecked = checked;
        this.title = title;
    }


    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public boolean isChecked() {
        return isChecked;
    }

    @Override
    public void toggle() {
        isChecked = !isChecked;
    }
}
