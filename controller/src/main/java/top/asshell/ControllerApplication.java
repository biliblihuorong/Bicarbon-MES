package top.asshell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
        System.out.println("启动成功");
    }
}
