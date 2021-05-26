package com.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.model.Player;
import com.player.repository.PlayerRepository;
import com.player.service.PlayerCrudService;

@Service
public class PlayerCrudServiceImpl implements PlayerCrudService {

	@Autowired
	private PlayerRepository playerRepository;
	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepository.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepository.save(player);
	}

	@Override
	public Player getPlayerByID(int id) {
		// TODO Auto-generated method stub
		return playerRepository.findById(id).get();
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		playerRepository.deleteById(id);
	}
	
	

}
