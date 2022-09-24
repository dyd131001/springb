package com.example.demo.cont;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data")
public class control {
	
	private final dataRepo Repo;

	
    @GetMapping("Search") //데이터 전체 조회 
    public String findAllMember() {
        return Repo.findAll().toString();
    }

    
    
    @GetMapping("write2")
    public data signUp() {
        data member = data.builder()
        		.id(2)
                .name("제육볶음")
                .ing("고추장, 양파")
                .build();
        this.Repo.save(member);
        return Repo.save(member);

    }
}