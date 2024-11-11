package example

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;

@Configuration
@EnableAutoConfiguration
@ComponentScan
class Main extends CommandLineRunner {
    override def run(args: String*) = println("Hello world!")
}

object Application extends App {

 SpringApplication.run(classOf[Main]);
}