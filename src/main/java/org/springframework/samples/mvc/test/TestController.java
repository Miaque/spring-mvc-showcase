package org.springframework.samples.mvc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    public static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "test");
        mv.setViewName("index");
        return mv;
    }
}
