package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository")
public class JpaConfig {
}