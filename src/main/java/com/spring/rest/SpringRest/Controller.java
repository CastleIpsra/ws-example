/**
 * 
 */
package com.spring.rest.SpringRest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IsraelC
 *
 */
@RestController
public class Controller {

	
	@RequestMapping(value="/api", method = RequestMethod.GET)
	public String metodoRest (@RequestParam(value="name", defaultValue="xx") String name){
		return "Inche " + name + " GAY!";
	}
	
	@RequestMapping(value="/suma", method = RequestMethod.GET)
	public int valor (@RequestParam(value="valor", defaultValue="0") int valor){
		return valor+1;
	}
	
	
	@RequestMapping(value="/appi", method = RequestMethod.POST)
	public String metodoRestB (@RequestBody String name){
		return "Inche " + name + " SUPER GAY!";
	}
}
