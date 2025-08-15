package com.common.solid;

interface NotificationChannel{
    void notification(String message);
}
class NotificationSendService implements NotificationChannel{
    @Override
    public void notification(String message) {
        System.out.println("Notification Sending....");
    }
}

interface Logger{
    void log(String message);
}

interface TemplateService{
    String prepareTemplete(String message);
}

class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

class SimpleTemplateService implements TemplateService{
    @Override
    public String prepareTemplete(String message) {
        return "[Formated: ] "+ message;
    }
}

class EmailChannel implements NotificationChannel{
    @Override
    public void notification(String message) {
        System.out.println("Email send Successfully");
    }
}

class SMSChannel implements NotificationChannel{

    @Override
    public void notification(String message) {
        System.out.println("SMS send successfully");
    }
}

class PushChannel implements NotificationChannel{


    @Override
    public void notification(String message) {
        System.out.println("Push Notification send successfully");
    }
}

class NotificationManager {
    Logger logger;
    TemplateService templateService;
    NotificationChannel notificationChannel;
    public NotificationManager(Logger logger, TemplateService templateService,NotificationChannel notificationChannel) {
        this.logger = logger;
        this.templateService = templateService;
        this.notificationChannel = notificationChannel;
    }

    public void sendNotification(String message){
        String formatted = templateService.prepareTemplete(message);
        System.out.println("Formated Notification : " + formatted);
        notificationChannel.notification(message);
    }

}

public class NotificationService {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        TemplateService templateService = new SimpleTemplateService();
        NotificationChannel notificationChannel = new EmailChannel();
        NotificationManager notificationManager = new NotificationManager(logger,templateService,notificationChannel);
        notificationManager.sendNotification("Hi Sir, Its a reminder email for meeting");
        notificationManager = new NotificationManager(logger,templateService,new SMSChannel());
        notificationManager.sendNotification("Reminder Notification");
        notificationManager = new NotificationManager(logger,templateService,new PushChannel());
        notificationManager.sendNotification("Push Notification Successfully");
    }
}
