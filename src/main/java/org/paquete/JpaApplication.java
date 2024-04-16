package org.paquete;
import org.paquete.entity.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.paquete.repository.PeliculaRepository;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner
{
    @Autowired
    private final PeliculaRepository peliculaRepository;


    public JpaApplication(PeliculaRepository peliculaRepository)
    {
        this.peliculaRepository = peliculaRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);



    }


    @Override
    public void run(String... args) throws Exception {
        Pelicula pelicula = new Pelicula("KillBill", 192,"01/01/1492");

        peliculaRepository.save(pelicula);
    }
}
