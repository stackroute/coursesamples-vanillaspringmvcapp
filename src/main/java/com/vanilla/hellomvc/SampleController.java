package com.vanilla.hellomvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class SampleController {

   @RequestMapping(method = RequestMethod.GET)
   public String welcome(ModelMap model) {
          model.addAttribute("name", "Hello World!");
          return "hello";
   }
}