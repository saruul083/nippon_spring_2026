package nippon;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
	
	@GetMapping(value = "/files/readme.txt", produces = MediaType.TEXT_PLAIN_VALUE)
		public String readme() {
		return """
					Week 14 README
					Topic: First REST controller
					Today: text, HTML, CSS, JS, then JSON
				""";
	}
}
