package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Fish.Model.Fish;
import com.example.Fish.Repository.FishRepository;

@Service
public class FishServiceImpl implements FishService{
	
	@Autowired
	private FishRepository fishRepository;

	@Override
	public Fish saveFish(Fish fish) {
		return fishRepository.save(fish);
	}

	@Override
	public List<Fish> fetchFish() {
		return fishRepository.findAll();
	}

	@Override
	public Fish updateFish(Fish fish, Long id) {
		Fish fishDb = fishRepository.findById(id).get();
//		if(Objects.nonNull(fish.))
		return fish;
	}

	@Override
	public void deleteFishById(Long id) {
		fishRepository.deleteById(id);
	}

}
