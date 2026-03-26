/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author tu650
 */
interface MessageService {
    void sendMessage(String message);
}


class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Fui Email: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Gui Sms: " + message);
    }
}


class Notification {
    private MessageService service;

    
    public void setService(MessageService service) {
        this.service = service;
    }

    public void send(String msg) {
        if (service != null) {
            service.sendMessage(msg);
        } else {
            System.out.println("Loi: Loi He thong");
        }
    }
}


public class Bai2 {
    public static void main(String[] args) {
        Notification notification = new Notification();

        
        notification.setService(new EmailService());
        notification.send("Chao mung ban den voi he thong!");

        // Đổi sang gửi qua SMS (linh hoạt, không cần sửa code lớp Notification)
        notification.setService(new SMSService());
        notification.send("Ma OTP cua ban la: 123456");
    }
}
