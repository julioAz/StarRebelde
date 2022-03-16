package br.julio.starrebelde;

import br.julio.starrebelde.model.Rebel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import br.julio.starrebelde.repository.rebeldeRepository;

@SpringBootApplication
public class StarRebeldeApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarRebeldeApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(rebeldeRepository rebeldeRepository){
        return args -> {
            rebeldeRepository.deleteAll();

            Rebel rebelde = new Rebel();
            rebelde.setName("Julio");
            //rebelde.setGender(Enum);
            rebelde.setBaseGalaxy("via lactea");
            rebelde.setLocation("1234");

            rebeldeRepository.save(rebelde);
        };
    }

}
