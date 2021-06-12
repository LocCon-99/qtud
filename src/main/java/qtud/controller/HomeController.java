package qtud.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import qtud.model.dto.respone.JwtResponse;

@RestController
@RequestMapping("/api/v2")
public class HomeController {
	
	
	  @GetMapping(value = "/hello")
	  @ResponseBody
	  public ResponseEntity<?>  hello()  {
	   String m = "HELLO";
	   return ResponseEntity.ok(m);
	  }
	
}
