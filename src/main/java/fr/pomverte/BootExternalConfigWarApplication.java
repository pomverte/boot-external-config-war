package fr.pomverte;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootExternalConfigWarApplication implements CommandLineRunner {

    @Value("${app.value:default}")
    private String value;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("value = [" + this.value + "]");
    }

    @RequestMapping("/")
    public String home() {
        return "value = [" + this.value + "]";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootExternalConfigWarApplication.class, args);
    }
}
