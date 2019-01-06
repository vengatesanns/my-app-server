package tech.hackpro.myapp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.hackpro.myapp.customexception.CustomException;
import tech.hackpro.myapp.entity.LoginDetails;
import tech.hackpro.myapp.entity.UserDetails;
import tech.hackpro.myapp.repository.LoginDetailsRepository;
import tech.hackpro.myapp.repository.userDetailsRepository;

@Service
public class UserDetailsService {
	
	 private final static Logger logger = Logger.getLogger(UserDetailsService.class);
	
	@Autowired
	private LoginDetailsRepository loginDetRepository;
	
	@Autowired
	private userDetailsRepository userDetailsRepository;
	
	
	public List<LoginDetails> getLoginUserDetails(LoginDetails userDetails) throws CustomException
	{
		try
		{
		 List<LoginDetails> loginUsers =  loginDetRepository.findByUsernameAndPassword(userDetails.getUsername(),userDetails.getPassword());
		 return loginUsers;
		}
		catch(Exception ex)
		{
			  logger.error("####### Error in getting User Details: "+ ex);	 
			  throw new CustomException("Error in Getting User Details");
		}
	}

	
	public void saveUserDetails(UserDetails userInfo) throws CustomException
	{
		try
		{
			userDetailsRepository.save(userInfo);
		}
		catch(Exception ex)
		{
			logger.error("##### Error in saving UserDetails in method -> saveUserDetails() " + ex);
			throw new CustomException("Error in User User Details");
		}
	}
}
