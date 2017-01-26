/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shibo.task;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shibo")
public class control {
   @RequestMapping("/welcome")
    protected ModelAndView handleRequestInternal(){ //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  ModelAndView mv=new ModelAndView("hello");
  mv.addObject("message", "hello every one i would like to report you about my experience");
  return mv;
}
       @RequestMapping("/hi")
    protected ModelAndView hi(){ //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  ModelAndView mv=new ModelAndView("hello");
  mv.addObject("message", "hi everyone");
  return mv;
}
}