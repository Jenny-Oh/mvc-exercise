package com.example.demo.service;

import com.example.demo.model.BoardDto;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }
    public BoardDto getBoardById(Integer boardid){
        return this.boardRepository.findById(boardid);
    }

    public BoardDto getBoardByName(String name){
        return this.boardRepository.findByName(name);
    }
}
