package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Player;
import com.nt.repository.PlayerRepository;

@Service
public class PlayerService implements IPlayerService{
	
	@Autowired
	public PlayerRepository playerRepo;
	
	@Override
	public String registerPlayer(Player info) {
		//return "Player is saved with ID value"+playerRepo.save(info).getPid();
		return "Player is saved with ID value::"+playerRepo.insert(info).getPid();
	}

}
