module com.mycompany.bai4 {
    requires javafx.controls;
    requires javafx.fxml;

    // Phải mở package này để JavaFX có thể can thiệp vào chạy ứng dụng
    opens com.mycompany.bai4 to javafx.graphics, javafx.fxml;
    
    exports com.mycompany.bai4;
}