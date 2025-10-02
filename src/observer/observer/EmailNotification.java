package observer.observer;

import observer.observable.StockObservable;

public class EmailNotification implements NotificationAlertObserver{
  StockObservable observable;

  public EmailNotification(StockObservable observable) {
    this.observable = observable;
  }

  @Override
  public void update() {
    System.out.println("Iphones are back in stock. Email Notification sent");
    System.out.println("Current stock qty : " + observable.getCount());
  }
}
