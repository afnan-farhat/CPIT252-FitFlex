package cpit252_fitflex;

class Coaches implements Observer {

    private String name;
    private NotificationSystem notification;

    public Coaches(String name, NotificationSystem notification) {
        this.name = name;
        this.notification = notification;
        notification.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Coaches " + name + " received notification: " + message);
    }
}
