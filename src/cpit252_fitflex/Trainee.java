
package cpit252_fitflex;


class Trainee implements Observer {

    private String name;
    private NotificationSystem notification;

    public Trainee(String name, NotificationSystem notification) {
        this.name = name;
        this.notification = notification;
        notification.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Trainee " + name + " received notification: " + message);
    }
}