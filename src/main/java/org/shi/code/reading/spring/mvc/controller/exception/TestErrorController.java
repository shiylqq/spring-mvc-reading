package org.shi.code.reading.spring.mvc.controller.exception;

import org.shi.code.reading.spring.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestErrorController {
  
    @RequestMapping("/exception")
    public ModelAndView exception(ModelAndView view) throws ClassNotFoundException {
        view.setViewName("index");
        throw new ClassNotFoundException("class not found");
    }

    @RequestMapping("/nullpointer")
    public ModelAndView nullpointer(ModelAndView view) {
        view.setViewName("index");
        String str = null;
        str.length();
        return view;
    }

    @RequestMapping("eh-test")
    @ResponseBody
    public User ExceptionHandlerTest() {
        throw new LianException();
    }
            
//    @ExceptionHandler(RuntimeException.class)
//    public ModelAndView error(RuntimeException error, HttpServletRequest request) {
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("error");
//        mav.addObject("msg", "Runtime error");
//        return mav;
//    }
//
//    @ExceptionHandler()
//    public ModelAndView error(Exception error, HttpServletRequest request, HttpServletResponse response) {
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("error");
//        mav.addObject("msg", "Exception error");
//        return mav;
//    }
    

//    @ExceptionHandler(NullPointerException.class)
//    public ModelAndView error(ModelAndView mav) {
//        mav.setViewName("error");
//        mav.addObject("msg", "NullPointer error");
//        return mav;
//    }


  
}