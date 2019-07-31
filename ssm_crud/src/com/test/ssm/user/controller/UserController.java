package com.test.ssm.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.ssm.user.model.User;
import com.test.ssm.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
 
    @Autowired
    UserService userService;
    
    /**
     *	 列出所有的数据*/
    @RequestMapping("/list")
    public String list(Model model){
        List<User> us= userService.list();
        model.addAttribute("us", us);
        return "/view";
    }
    /**
     *	 增加数据*/
    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String addUser(Model model){
        model.addAttribute(new User());
        return "/add";
    }
    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String add(@ModelAttribute("user1")User user){
        userService.addUser(user);
        return "redirect:/user/list";
	}
    /**
     *	 删除数据,springmvc不能直接识别method=RequestMethod.delete*/
    @RequestMapping(value= {"/delete/{id}"},method=RequestMethod.GET)
    public String del(@PathVariable("id") int id){
        userService.delUser(id);
        return "redirect:/user/list";
    }
    /**
     *	 查询及修改数据，只能支持id查询*/
    @RequestMapping(value= {"/edit/{id}"},method=RequestMethod.GET)
    public String editUI(@PathVariable("id") int id,Model model){
        User user = userService.get(id);
        model.addAttribute("user",user);
        return "/edit";
    }
    
    @RequestMapping(value= {"/edit/{id}"},method=RequestMethod.POST)
    public String update(@ModelAttribute("user2")User user){
        userService.updateUser(user);
        return "redirect:/user/list";
    }
 
}