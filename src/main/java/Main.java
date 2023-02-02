public class Main {
    public static void main(String[] args) {

        ListExample list = new ListExample();
        list.addToList(10);
        list.searchListItem(7);
        list.deleteListItem(4);

        MapExample map = new MapExample();
        map.addToMap(10);
        map.searchMapItem(7);
        map.deleteMapItem(4);

        QueueExample queue = new QueueExample();
        queue.addItemToQueue(20);
        queue.searchLQueueItem(14);
        queue.deleteQueueItem(4);

        SetExample set = new SetExample();
        set.addToSet(20);
        set.searchSetItem(11);
        set.deleteSetItem(10);

    }
}