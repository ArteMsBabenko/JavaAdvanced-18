package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {

}