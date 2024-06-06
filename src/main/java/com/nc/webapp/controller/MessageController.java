package com.nc.webapp.controller;

import com.nc.webapp.mdel.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageController {
    private List<Message> messageList = new ArrayList<Message>();

    @GetMapping("/message")
    public String showMessage(Model model){
        model.addAttribute("newMessage", new Message());
        model.addAttribute("msgeList", messageList);
        return "messagePage";
    }
    @PostMapping("/message")
    public String addMessage(@ModelAttribute Message newMessage){
        messageList.add(newMessage);
        return "redirect:/message";
    }
}
