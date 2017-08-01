package xyz.hardik;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CobrandsController{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ConrandsServices cobSer;
	
	@RequestMapping("/cobrands")
	public List<Cobrands> getAllCobrands(){
		logger.debug("Calling Method to get All Cobrands");
		logger.warn("Getting All Cobrands : warning");
		logger.error("ERROR : Error while calling method for all cobrands...");
		return cobSer.getAllCobrands();
	}
	
	
	@RequestMapping("/cobrands/{id}")
	public Optional<Cobrands> getCobrand(@PathVariable("id") String id){
		return cobSer.getCobrand(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cobrands")
	public void addCobrand(@RequestBody Cobrands cobrand){
		cobSer.addCobrand(cobrand);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/cobrands/{id}")
	public void updateCobrand(@RequestBody Cobrands cobrand,@PathVariable String id){
		cobSer.updateCobrand(cobrand,id);
	
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/cobrands/{id}")
	public void deleteCobrand(@RequestBody String id){
		cobSer.deleteCobrand(id);
	}
	
	
}