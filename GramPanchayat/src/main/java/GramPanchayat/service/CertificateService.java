package GramPanchayat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GramPanchayat.model.BirthData;
import GramPanchayat.model.DeathData;
import GramPanchayat.model.Marriege;
import GramPanchayat.model.Voter;
import GramPanchayat.repository.BirthDataRepo;
import GramPanchayat.repository.DeathRepo;
import GramPanchayat.repository.MarriegeRepo;
import GramPanchayat.repository.VoterRepo;

@Service
public class CertificateService {
//	@Autowired
//	private CertificateService  service1;

	@Autowired
	private BirthDataRepo repo;

	@Autowired
	private DeathRepo drepo;
	
	@Autowired
	private VoterRepo vrepo;
	
	@Autowired
	private MarriegeRepo mrepo;

	public void deathsave(DeathData b) {

		drepo.save(b);
	}

	public void save(BirthData b) {
		repo.save(b);

	}
	public void saveVoter(Voter v) {
		vrepo.save(v);
	}
	public void saveMarrieage(Marriege m) {
		mrepo.save(m);
	}
	
}
