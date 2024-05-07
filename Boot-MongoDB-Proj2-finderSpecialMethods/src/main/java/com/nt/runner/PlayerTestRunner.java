package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Player;
import com.nt.service.IPlayerService;

@Component
public class PlayerTestRunner implements CommandLineRunner{
	
	@Autowired
	public IPlayerService playerService;
	
	@Override
	public void run(String... args) throws Exception {
		
		Player player=new Player();
		player.setPid(new Random().nextInt(2000));
		player.setPName("Rohith");
		player.setPAddr("Mumbai");
		player.setNickName(List.of("Ro","Hitman","sharma"));
		player.setContactNumbers(Set.of(90000000L, 9111111111L));
		//player.setFriends(new String[] {"Kohli","dhoni","rahul","pant"});
		String[] s=new String[]{"Kohli","Dhoni","Rahul"};
		player.setFriends(s);
		player.setImpKnocks(Map.of("world_cup","146 runs","asia_cup","104 runs"));
		Properties p=new Properties();
		p.put("aadhar", "9000 5678 8901 0987" );
		p.put("pan","BPYPR000");
		player.setIdDetails(p);
		
		System.out.println(playerService.registerPlayer(player));
		
	}

}
