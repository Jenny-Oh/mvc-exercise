package com.example.demo.controller;

import com.example.demo.model.BoardDto;
import com.example.demo.model.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.BoardService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    //private UserService userService;
    private BoardService boardService;

    public HelloWorldController(BoardService boardService) {

        this.boardService = boardService;
    }
    @GetMapping("/")
    public String printHelloWorld(Model model){

        /*
        model.addAttribute( "name","~!~World");
        model.addAttribute( "age","113");
        UserDto userDto = this.userService.getUserById(1);
        System.out.println(userDto.getUsername());
        System.out.println(userDto.getId());
        model.addAttribute("username",userDto.username);

         */
        BoardDto boardDto = this.boardService.getNameById(0);
        BoardDto boardDto1 = this.boardService.getIdByName("record");

        //System.out.println(boardDto.getBoardname());
        //System.out.println(boardDto1.getBoardid());
        model.addAttribute("boardname", boardDto.getBoard_name());
        model.addAttribute("boardid", boardDto1.getBoard_id());

        return "index";
    }
}
