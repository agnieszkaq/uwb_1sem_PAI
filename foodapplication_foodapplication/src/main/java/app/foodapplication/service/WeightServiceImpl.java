package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.WeightDAO;
import app.foodapplication.model.Weight;

@Service
public class WeightServiceImpl implements WeightService {
	
	@Autowired
	WeightDAO weightDAO;
	
	@Transactional
	@Override
	public List<Weight> get() {
		return weightDAO.get();
	}

	@Transactional
	@Override
	public Weight get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void save(Weight weight) {
		// TODO Auto-generated method stub

	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
