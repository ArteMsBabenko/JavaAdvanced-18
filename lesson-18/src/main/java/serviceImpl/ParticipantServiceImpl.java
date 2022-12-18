package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ParticipantRepository;
import domain.Participant;
import service.ParticipantService;

@Service
public class ParticipantServiceImpl implements ParticipantService {

	@Autowired
	private ParticipantRepository participantRepository;

	@Override
	public Participant create(Participant university) {
		return participantRepository.save(university);
	}

	@Override
	public List<Participant> findAll() {
		return participantRepository.findAll();
	}

	@Override
	public Participant findById(Integer id) {
		return participantRepository.getOne(id);
	}

	@Override
	public Participant update(Participant university) {
		return participantRepository.save(university);
	}

	@Override
	public void deleteById(Integer id) {
		participantRepository.deleteById(id);
	}

}
