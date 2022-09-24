package com.knu.ref;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.knu.ref.ingred.Ingred;
import com.knu.ref.ingred.IngredRepository;

@SpringBootTest
class RefApplicationTests {

	
	@Autowired
	private IngredRepository ingredRepository;
	@Test
	void tsetJpa() {
		Ingred ig1= new Ingred();
		ig1.setIngredient("김치");
		this.ingredRepository.save(ig1);
	}

}
