package xyz.hardik;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConrandsServices {
	
	@Autowired
	private CobrandsRepositories cobRepo;
	
	public List<Cobrands> getAllCobrands(){
		List<Cobrands> cl = new ArrayList<>();
		cobRepo.findAll().forEach(cl::add);	
		return cl;
	}
	
	public Optional<Cobrands> getCobrand(String id){
		return cobRepo.findById(id);
	}
	
	public String addCobrand(Cobrands cobrand) {
		cobRepo.save(cobrand);
		return "<html><body bgcolor=\"green\">Cobrand Added ";
	}
	
	public void updateCobrand(Cobrands cobrand, String id) {
		cobRepo.save(cobrand);
		System.out.println("Cobrand Updated for ID :- "+id);
		
	}

	public void deleteCobrand(String id) {
		cobRepo.deleteById(id);
		System.out.println("Cobrand Deleted for ID :- "+id);
		
	}
}