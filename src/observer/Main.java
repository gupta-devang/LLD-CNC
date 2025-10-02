package observer;

import observer.observable.IphoneStockObservable;
import observer.observable.StockObservable;
import observer.observer.EmailNotification;
import observer.observer.MobileNotification;
import observer.observer.NotificationAlertObserver;

public class Main {
  public static void main(String[] args) {
    StockObservable iphoneStockObservable = new IphoneStockObservable();
    NotificationAlertObserver mobileNotification = new MobileNotification(iphoneStockObservable);
    NotificationAlertObserver emailNotificationObserver = new EmailNotification(iphoneStockObservable);
    iphoneStockObservable.add(mobileNotification);
    iphoneStockObservable.add(emailNotificationObserver);
    iphoneStockObservable.setCount(5);
  }
}
