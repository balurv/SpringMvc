package com.example.Fish.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Fish.Model.Fish;
import com.example.service.FishServiceImpl;

@RestController
@RequestMapping("/fish")
public class FishController {

	@Autowired
	private FishServiceImpl fishService;
	
	@PostMapping
	public ResponseEntity<Fish> saveFish( @RequestBody Fish fish) {
		return ResponseEntity.ok(fishService.saveFish(fish));
	}
	
	@GetMapping
	public ResponseEntity<List<Fish>> fetchFishList(){
		return ResponseEntity.ok(fishService.fetchFish());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFishById(@PathVariable("id") Long fishId) {
		fishService.deleteFishById(fishId);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully");
	}
}
