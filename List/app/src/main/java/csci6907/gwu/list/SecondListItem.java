package csci6907.gwu.list;

/**
 * Created by Minghao Pu on 9/26/16.
 */

/**
 * Data model for the second list
 */

public class SecondListItem {
    public SecondListItem(String s) {
        this.content = s;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
}
