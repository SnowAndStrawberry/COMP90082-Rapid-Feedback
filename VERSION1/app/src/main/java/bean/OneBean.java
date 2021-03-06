/**
 * Created by: Android frontend team
 *
 * Team Member: Wang AN, NingJiang XIE
 */

package bean;

import java.util.List;


public class OneBean {

    private String title;


    private List<TwoBean> operation;

    public OneBean() {
    }

    public OneBean(List<TwoBean> operation, String title) {
        this.operation = operation;
        this.title = title;
    }

    public List<TwoBean> getOperation() {
        return operation;
    }

    public void setOperation(List<TwoBean> operation) {
        this.operation = operation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
