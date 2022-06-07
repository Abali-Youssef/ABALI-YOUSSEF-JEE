package com.abaliyoussef;

import com.abaliyoussef.entities.Genre;
import com.abaliyoussef.entities.Participant;
import com.abaliyoussef.repositories.ParticipantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ExamenAbaliyoussefApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenAbaliyoussefApplication.class, args);
	}
CommandLineRunner  start(ParticipantRepository participantRepository){
	return args -> {
		Stream.of("Hassan","Yassine","Aicha").forEach(name->{
			Participant participant = new Participant();
			participant.setEmail(name+"@gmail.com");
			participant.setGenre(Genre.FEMININ);
			participant.setNom(name);

			participant.setPhoto(name+"photo");
			participantRepository.save(participant);
		});

	};
}
}
