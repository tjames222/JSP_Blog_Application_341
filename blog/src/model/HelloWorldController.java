package model;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(path="/test1", method=RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		return "Hello World!";
	}
}
