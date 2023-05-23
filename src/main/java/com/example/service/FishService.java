package com.example.service;

import java.util.List;

import com.example.Fish.Model.Fish;

public interface FishService {
	
	Fish saveFish(Fish fish);
	
	List<Fish> fetchFish();
	
	Fish updateFish(Fish fish, Long id);
	
	void deleteFishById(Long id);
}
