package com.qa.interoperability;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.apache.log4j.Logger;
import com.qa.constants.Constants;
import com.qa.service.TraineeService;

@Path(Constants.TRAINEE_PATH)
public class ApplicationEndpoint {
		private static final Logger LOGGER = Logger.getLogger(ApplicationEndpoint.class);
		
		@Inject
		private TraineeService service;
		
		@Path(Constants.JSON_PATH)
		@GET
		@Produces({ Constants.PRODUCES })
		public String findAllTrainees() {
			LOGGER.info("In ApplicationEndpoint findAllTrainees");
			return service.getAllTrainees();
		}
		
		@Path(Constants.JSON_PATH)
		@POST
		@Produces({ Constants.PRODUCES })
		public String createTrainee(String trainee) {
			LOGGER.info("In ApplicationEndpoint createTrainee");
			return service.createTrainee(trainee);
		}
		
		@Path(Constants.JSON_PATH_WITH_ID)
		@PUT
		@Produces({ Constants.PRODUCES })
		public String updateTrainee(@PathParam(Constants.ID) long id, String trainee) {
			LOGGER.info("In ApplicationEndpoint updateTrainee");
			return service.updateTrainee(id, trainee);
		}
		
		@Path(Constants.JSON_PATH_WITH_ID)
		@DELETE
		@Produces({ Constants.PRODUCES })
		public String deleteTrainee(@PathParam(Constants.ID) long id) {
			LOGGER.info("In ApplicationEndpoint deleteTrainee");
			return service.deleteTrainee(id);
		}
		
		public void setService(TraineeService service) {
			this.service = service; 
		}
}
