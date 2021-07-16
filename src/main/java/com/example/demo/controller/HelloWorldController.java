package com.example.demo.controller;

import com.example.demo.model.BoardDto;
import com.example.demo.model.PostDto;
import com.example.demo.service.BoardService;
import com.example.demo.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    //private UserService userService;
    private BoardService boardService;
    private PostService postService;
    /*
    public HelloWorldController(UserService userService) {
        this.userService = userService;

    }

     */
    public HelloWorldController(BoardService boardService, PostService postService) {

        this.boardService = boardService;
        this.postService = postService;
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

        // BOARD
        BoardDto boardDto = this.boardService.getNameById(0);
        BoardDto boardDto1 = this.boardService.getIdByName("record");

        //System.out.println(boardDto.getBoardname());
        //System.out.println(boardDto1.getBoardid());
        model.addAttribute("boardname", boardDto.getBoard_name());
        model.addAttribute("boardid", boardDto1.getBoard_id());

        // POST
        PostDto postDto = this.postService.getPostByTitle("hello");
        PostDto postDto1 = this.postService.getPostByContext("hi");
        model.addAttribute("postid",postDto.getPost_id());
        model.addAttribute("posttitle",postDto.getPost_title());
        return "index";
    }
}
