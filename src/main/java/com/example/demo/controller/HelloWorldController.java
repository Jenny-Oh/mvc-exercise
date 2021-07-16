package com.example.demo.controller;

import com.example.demo.model.AdminDto;
import com.example.demo.model.BoardDto;
import com.example.demo.model.PostDto;
import com.example.demo.service.AdminService;
import com.example.demo.service.BoardService;
import com.example.demo.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {

    //private UserService userService;
    private BoardService boardService;
    private PostService postService;
    private AdminService adminService;
    /*
    public HelloWorldController(UserService userService) {
        this.userService = userService;

    }

     */
    public HelloWorldController(BoardService boardService, PostService postService, AdminService adminService) {

        this.boardService = boardService;
        this.postService = postService;
        this.adminService = adminService;
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
        BoardDto boardDto = this.boardService.getBoardById(0);
        BoardDto boardDto1 = this.boardService.getBoardByName("record");

        //System.out.println(boardDto.getBoardname());
        //System.out.println(boardDto1.getBoardid());
        model.addAttribute("boardname", boardDto.getBoard_name());
        model.addAttribute("boardid", boardDto1.getBoard_id());

        // POST
        List<PostDto> postDtos = this.postService.getPostByTitle("hello");
        List<PostDto> postDto1 = this.postService.getPostByContext("hi");

        List<Integer> listofid = new ArrayList<Integer>();
        List<String> listoftitle = new ArrayList<String>();
        postDtos.stream().forEach(postDto ->
                listofid.add(postDto.getPost_id()));
        postDto1.stream().forEach(postDto ->
                listoftitle.add(postDto.getPost_title()));

        model.addAttribute("postid",listofid);
        model.addAttribute("posttitle",listoftitle);


        // ADMIN
        AdminDto adminDto = this.adminService.getAdminbyId(1111);
        AdminDto adminDto1 = this.adminService.getAdminbyName("jyo");

        model.addAttribute("adminname",adminDto.getAdmin_name());
        model.addAttribute("adminauth",adminDto1.getAdmin_auth());
        return "index";
    }
}
