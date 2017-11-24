package info.sanaulla.thymeleaflayoutdialectboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

	@GetMapping
	public String page1() {
		return "page1";
	}
	
	@GetMapping("/page2")
	public String page2() {
		return "page2";
	}
}
