package controller;

import dao.UserDao;
import model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.InitParam;

@Controller
@RequestMapping("/home/")
public class UserController {
    @RequestMapping("")
    public ModelAndView home(){
        return new ModelAndView("index","login",new Login());
    }

    @GetMapping("login")
    public ModelAndView login(@ModelAttribute("login")Login login){
        User user = UserDao.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
