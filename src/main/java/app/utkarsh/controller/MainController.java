package app.utkarsh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class MainController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String main() {
		return "hello";
	}
}
