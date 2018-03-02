package web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("web")
public class SpringBootStart extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder
                    configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootStart.class);
    }

    public static void main(String[] args) {
        new SpringBootStart()
                .configure(new SpringApplicationBuilder(SpringBootStart.class))
                .run(args);
    }
}
