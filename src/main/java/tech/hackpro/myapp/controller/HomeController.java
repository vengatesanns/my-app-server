package tech.hackpro.myapp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.hackpro.myapp.customexception.CustomException;
import tech.hackpro.myapp.entity.LoginDetails;
import tech.hackpro.myapp.entity.UserDetails;
import tech.hackpro.myapp.service.UserDetailsService;

@RestController
@RequestMapping("/home")
@CrossOrigin("*")
public class HomeController
{
	private final static Logger logger = Logger.getLogger(HomeController.class);
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	
    @GetMapping("/test")
    public String getValue()  //Removable
    {
        return "HelloWorld";
    }

    
    @PostMapping("/getLoginUserDetails")
    public List<LoginDetails> getLoginUsers(@RequestBody LoginDetails userInfo) throws CustomException
    {
    	try
    	{
    	return userDetailsService.getLoginUserDetails(userInfo);
    	}
    	catch(Exception ex)
    	{
    		logger.error("######### Error in getting User Details"+ex);
    		throw new CustomException(ex.getMessage());
    	}
    }
    
    @PostMapping("/saveUserDetails")
    public void saveUserDetails(@RequestBody UserDetails userInfo) throws CustomException
    {
    	try
    	{
    	  userDetailsService.saveUserDetails(userInfo);
    	}
    	catch(Exception ex)
    	{
    		logger.error("######### Error in getting User Details"+ex);
    		throw new CustomException(ex.getMessage());
    	}
    }

}