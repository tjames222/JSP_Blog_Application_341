package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.blog.business.RegistrationService;
import com.blog.model.Post;
import com.blog.model.User;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

@Component("blogController")
@Controller
@RequestMapping(path= "/")
public class BlogController {
	
	public RegistrationService regService;
	
	@Autowired
	@RequestMapping(path = "/regService", method = RequestMethod.GET)
	public void setRegService(RegistrationService  regService) {
		this.regService = regService;
	}
	
	public RegistrationService getRegService() {
		return this.regService;
	}
	
	
	
	//Directs to index.jsp when going to localhost:8080/blog/index
	@RequestMapping(path = "/index", method = RequestMethod.GET) 
	public String home(ModelMap model) {
		
		return "index";
	}
	
	@RequestMapping(path = "/aboutUs", method = RequestMethod.GET) 
	public String aboutUs(ModelMap model) {
		
		return "AboutUs";
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
		
		///////////// FOR TESTING ///////////
		userList.add(user);
		
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).toString());
		}
		
		for (int i = 0; i < 10; i++) {
			Post testPost = new Post(Integer.toString(i), "some Content.");	
			postList.add(testPost);
		}
		
		
		for (int i = 0; i < postList.size(); i++) {
			System.out.println(postList.get(i).toString());
		}
		
		regService.registering(user);
		//Send to submit() to take user to postFeed
		return submit(user, model);
	}
	
	//Upon login call submit() 
	//Submit takes user to postFeed.jsp
	@RequestMapping(path = "/postFeed", params = "submit", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("user") User user, Model model) {
		
		// Check to see if a user is in the userList and if the password matches 
		// If match add welcome message
		// If fail have user try again with message
		if (userList.toString().contains(user.getUserName())) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail!");
		}
		
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
    
    //Directs to postFeed.jsp when going to localhost:8080/blog/blogPosts
  	@RequestMapping(path = "/blogPosts", method = RequestMethod.GET) 
  	public String blogPosts(ModelMap model) {
  		
  		return "postFeed";
  	}
  	
    //Directs to newPost.jsp when going to localhost:8080/blog/create
  	@RequestMapping(path = "/create", method = RequestMethod.GET) 
  	public String create(ModelMap model) {
  		
  		return "newPost";
  	}
  	
  	//Directs to account.jsp when going to localhost:8080/blog/myAccount
  	@RequestMapping(path = "/myAccount", method = RequestMethod.GET) 
  	public String myAccount(ModelMap model) {
  		
  		return "account";
  	}
  	
    //Directs to account.jsp when going to localhost:8080/blog/about
  	@RequestMapping(path = "/about", method = RequestMethod.GET) 
  	public String about(ModelMap model) {
  		
  		return "AboutUs";
  	}
  	
  	@RequestMapping(path = "/submitPost", params = "savepost", method = RequestMethod.POST)
    public String submitPost(@Valid @ModelAttribute("post") Post post, Model model) {
  		post.setTitle(post.getTitle().toUpperCase());
  		postList.add(post);
        model.addAttribute("title", post.getTitle().toUpperCase());
        model.addAttribute("content", post.getContent());
        
        ///////////// FOR TESTING ///////////
        int index = postList.lastIndexOf(post);
        
        System.out.println(postList.lastIndexOf(post));
        System.out.println(postList.get(index).toString());      
        
        return "postFeed";
    } 
  	
  	//Directs to newPost.jsp when going to localhost:8080/blog/view
  	@RequestMapping(path = "/view", method = RequestMethod.GET) 
  	public String view(ModelMap model, Post post) {
  		model.addAttribute("title", post.getTitle().toUpperCase());
        model.addAttribute("content", post.getContent());
  		 		
  		return "viewPost";
  	}
  	
  	
  	//////////////////////////////////////////////////// FOR TESTING PURPOSES //////////////////////////////////////////////
  	
  	private List<User> userList = new ArrayList<>();
	private List<Post> postList = new ArrayList<>();
  	
  	// Temporary User list for testing purposes
  	@ModelAttribute(name="userlist")
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	// Temporary Post list for Testing purposes
	@ModelAttribute(name="postlist")
	public List<Post> getPostList() {
		return postList;
	}

	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	
	
}
