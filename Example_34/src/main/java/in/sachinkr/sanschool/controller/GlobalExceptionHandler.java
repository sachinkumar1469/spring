package in.sachinkr.sanschool.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionController(Exception exception){
        System.out.println(exception.getCause());
        var view = new ModelAndView();
        view.setViewName("error");
        view.addObject("errormsg",exception.getMessage());
        return view;
    }
}
