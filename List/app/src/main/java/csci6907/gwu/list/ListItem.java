package csci6907.gwu.list;

/**
 * Created by Minghao Pu on 9/26/16.
 */

public class ListItem {
    public ListItem(String title, String detail) {
        this.detail = detail;
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
    private String detail;
}
