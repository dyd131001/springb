package com.knu.ref.ingred;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class IngredService{
	private final IngredRepository ingredRepository;
	 
	 public List<Ingred> getList() {
	        return this.ingredRepository.findAll();
	    }
	 
	 public void create(String ingredname) {
	        Ingred ingred = new Ingred();
	        ingred.setIngredient(ingredname);
	        this.ingredRepository.save(ingred);
	    }
}

