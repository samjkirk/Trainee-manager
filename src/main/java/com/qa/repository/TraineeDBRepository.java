package com.qa.repository;

import javax.transaction.Transactional;
import org.apache.log4j.Logger;
import com.qa.constants.Constants;
import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional(SUPPORTS)
public class TraineeDBRepository implements iTraineeRepository {
	
	private static final Logger LOGGER = Logger.getLogger(iTraineeRepository.class);
	
	@PersistenceContext(unitName = Constants.UNIT_NAME)
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;

	public String getAllTrainees() {
		LOGGER.info("In TraineeDBRepository getAllAccounts");
		return util.getJSONForObject(manager.createQuery(Constants.QUERY1).getResultList());
	}

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		LOGGER.info("In TraineeDBRepository createTrainee");
		Trainee result = util.getObjectForJSON(trainee, Trainee.class);
		manager.persist(result);
		return Constants.TRAINEE_ADDED;
	}

	@Override
	public String updateTrainee(long id, String trainee) {
		LOGGER.info("In TraineeDBRepository updateAccount");
		Trainee update = util.getObjectForJSON(trainee, Trainee.class);
		Trainee original = findTrainee(id);
		if (trainee != null) {
			original = update;
			original.setId(id); 
			manager.merge(original);
		}
		return Constants.TRAINEE_UPDATED;
	}
	
	public Trainee findTrainee(long id) {
		LOGGER.info("In TraineeDBRepository findTrainee");
		return manager.find(Trainee.class, id);
	}

	@Override
	public String deleteTrainee(long id) {
		LOGGER.info("In TraineeDBRepository deleteTrainee");
		Trainee delete = findTrainee(id);
		if (delete != null) {
			manager.remove(delete);
		}
		return Constants.TRAINEE_DELETED;
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	public void setUtil(JSONUtil util) {
		this.util = util;
	}
}
