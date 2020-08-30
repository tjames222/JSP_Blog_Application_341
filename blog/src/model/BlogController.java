package model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping(path= "/")
public class BlogController {
	
	//Directs to index.jsp when going to localhost:8080/blog/index
	@RequestMapping(path = "/index", method = RequestMethod.GET) 
	public String home(ModelMap model) {
		
		return "index";
	}
	
	//When "Go to registration" link inside index.jsp is clicked call register()
	//Register takes user to registration.jsp
	@RequestMapping(path = "/register", method = RequestMethod.GET) 
	public ModelAndView register() {
		
		return new ModelAndView("registration", "user", new User());
	}
	
	//When "Go to login" link inside index.jsp is clicked call login()
	//Login takes user to login.jsp
	@RequestMapping(path = "/login", method = RequestMethod.GET) 
	public ModelAndView login() {
		
		return new ModelAndView("login", "user", new User());
	}
	
	//Upon valid input within registration.jsp, registering() is called
	//Registering take user to submit()
	@RequestMapping(path = "/registered", method = RequestMethod.POST)
	public String registering(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "register";
		}
		
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("lastName", user.getLastName());
		
		//Send to submit() to take user to postFeed
		return submit(user, model);
	}
	
	//Upon login call submit() 
	//Submit takes user to postFeed.jsp
	@RequestMapping(path = "/postFeed", params = "submit", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("user") User user, Model model) {
        model.addAttribute("username", user.getUserName());
        model.addAttribute("password", user.getPassword());
        return "postFeed";
    } 
	
	//Takes user from login to register by calling goToRegister()
	//goToRegister calls register()
    @RequestMapping(path = "/register", params = "register", method = RequestMethod.POST)
    public ModelAndView goToRegister() {
    	//calls previous register() to open registration.jsp
        return register();
    }
    

	
	
}
