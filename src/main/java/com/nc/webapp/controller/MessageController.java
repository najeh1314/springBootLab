package com.nc.webapp.controller;

import com.nc.webapp.DAO.MessageDAO;
import com.nc.webapp.mdel.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

import static java.lang.Long.valueOf;

@Controller
public class MessageController {
    @Autowired
    MessageDAO messageDAO;
    @GetMapping("/message")
    public String showMessage(Model model){
        model.addAttribute("newMessage", new Message());
        model.addAttribute("msgeList", messageDAO.findAll());
        return "messagePage";
    }
    @PostMapping("/message")
    public String addMessage(@ModelAttribute Message newMessage){
        Message mssge = new Message(newMessage.getAuthor(), newMessage.getMessage(), LocalDateTime.now());
        messageDAO.save(mssge);
        return "redirect:/message";
    }
}
