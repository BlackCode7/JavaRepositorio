package io.blackcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController()
public class VendasApplication {

    // https://start.spring.io/
    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter/2.2.4.RELEASE
    // https://github.com/cursodsousa/curso-spring-boot-especialista/tree/03_configuracoes_e_beans
    // Link para comparação de código

    @Autowired
    @Qualifier("applicationName")
    //@Value("${application.name}") // caso não use a class bean
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
