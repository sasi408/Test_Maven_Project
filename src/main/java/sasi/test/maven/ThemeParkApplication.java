package sasi.test.maven;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sasi.test.maven.dao.ThemeParkRideRepository;
import sasi.test.maven.dto.ThemeParkRide;
import sasi.test.maven.dto.ThemeParkRideDto;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ThemeParkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThemeParkApplication.class);
    }
    @Bean
    public CommandLineRunner sampleData(ThemeParkRideRepository repository) {
        return (args) -> {
            List<ThemeParkRideDto> themeParkRideDtoList=new ArrayList<ThemeParkRideDto>();
            themeParkRideDtoList.add(new ThemeParkRideDto("Rollercoaster", "Train ride that speeds you along.", 5, 3));
            themeParkRideDtoList.add(new ThemeParkRideDto("Log flume", "Boat ride with plenty of splashes.", 3, 2));
            themeParkRideDtoList.add(new ThemeParkRideDto("Teacups", "Spinning ride in a giant tea-cup.", 2, 4));
            themeParkRideDtoList.add(new ThemeParkRideDto("Teacups1", "Spinning ride in a giant tea-cup1.", 6, 7));
            themeParkRideDtoList.forEach(themeParkRideDto ->
                repository.save(new ThemeParkRide(themeParkRideDto.getName(),themeParkRideDto.getDescription(),themeParkRideDto.getThrillFactor(),themeParkRideDto.getVomitFactor()))
            );
        };
    }
}
