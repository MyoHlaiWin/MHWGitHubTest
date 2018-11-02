package GitHubTest.RestControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.*;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String Hello() {
		return new Gson().toJson("Hello, .....");
	}
	
	@GetMapping("/hi")
	public String Hi() {
		return new Gson().toJson("Hi, .....");
	}
	
	@RequestMapping("/")
	public String index() {
		return new Gson().toJson("I am Index .....");
	}

}
