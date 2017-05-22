package com.helpingHands.ffh.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//
//import com.helpingHands.ffh.Model.AreaDetails;
//import com.helpingHands.ffh.Model.user;
//import com.helpingHands.ffh.serviceImpl.commonServiceImpl;


@Path(value="/ffhApi")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
public class Controller {
	@GET
	@Path(value="/test")
    public String getMobileVersionDetails() {
		
        return "success"; 
    }
//	@POST
//	@Path(value="/verifyEmail")
//    public user verifyEmail(user user) {
//		commonServiceImpl comService = new commonServiceImpl();
//		user userRes = comService.emailVerify(user);
//        return userRes; 
//    }
//	@POST
//	@Path(value="/getLocality")
//    public AreaDetails getLocality(AreaDetails user) {
//		commonServiceImpl comService = new commonServiceImpl();
//		AreaDetails userRes = comService.getLocality(user);
//        return userRes; 
//    }
//	@POST
//	@Path(value="/verifyMobile")
//    public user verifyMobile(user user) {
//		commonServiceImpl comService = new commonServiceImpl();
//		user userRes = comService.mobileVerify(user);
//        return userRes; 
//    }
//	@POST
//	@Path(value="/registerUser")
//    public user registerUser(user user) {
//		commonServiceImpl comService = new commonServiceImpl();
//		user userRes = comService.RegisterUser(user);
//        return userRes; 
//    }
}
