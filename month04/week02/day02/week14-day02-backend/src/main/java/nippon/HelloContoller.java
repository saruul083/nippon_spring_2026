package nippon;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
	
	public record HelloResponse(String message, int week) {}
	
	@GetMapping("/api/hello")
	public String hello() {
		return "Hello from Spring boots";
	}
	
	@GetMapping("/api/status")
	public HelloResponse status() {
		return new HelloResponse("REST controller is working", 14);
	}
}
