package tech.hackpro.myapp.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

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
    public Date getValue() throws CustomException  //Removable
    {
    	if(new Date() != null)
    		throw new CustomException("Errorrrrrr!!!!!!");
        return new Date();
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
    public void saveUserDetails(@Valid @RequestBody UserDetails userInfo) throws CustomException
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