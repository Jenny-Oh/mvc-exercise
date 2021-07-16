package com.example.demo.service;

import com.example.demo.model.AdminDto;
import com.example.demo.repository.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    public AdminRepository adminRepository;
    public AdminService(AdminRepository adminRepository){
        this.adminRepository=adminRepository;
    }
    public AdminDto getAdminbyId(Integer id){
        return this.adminRepository.findById(id);
    }
    public AdminDto getAdminbyName(String name){
        return this.adminRepository.findByName(name);
    }
}
