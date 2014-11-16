package es.sebas.formularios.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sebas.formularios.Entity.Hoc;
import es.sebas.formularios.Repository.HocRepository;

@Service
@Transactional
public class HocFormService {
	
	
	@Autowired
	private HocRepository hocRepository;

	
	public void save(Hoc hocform){
		hocRepository.save(hocform);
	}


	public List<Hoc> damelosTodos() {
		
		return hocRepository.findAll();
	}
}
