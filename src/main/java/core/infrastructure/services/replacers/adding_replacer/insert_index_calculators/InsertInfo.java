package core.infrastructure.services.replacers.adding_replacer.insert_index_calculators;

public class InsertInfo {
    private int indexToInsert;

    private boolean isTopAttaching;
    private boolean isBottomAttaching;

    public int getIndexToInsert() {
        return indexToInsert;
    }

    public boolean isTopAttaching() {
        return isTopAttaching;
    }

    public boolean isBottomAttaching() {
        return isBottomAttaching;
    }

    public void setIndexToInsert(int indexToInsert) {
        this.indexToInsert = indexToInsert;
    }

    public void setTopAttaching() {
        setTopAttaching(true);
    }

    public void setTopAttaching(boolean topAttaching) {
        isTopAttaching = topAttaching;
    }

    public void setBottomAttaching() {
        setBottomAttaching(true);
    }

    public void setBottomAttaching(boolean bottomAttaching) {
        isBottomAttaching = bottomAttaching;
    }
}
