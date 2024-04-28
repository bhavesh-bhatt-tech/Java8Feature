package com.devhabit.java.sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * The class will demonstrate sorting a map using java 8
 * Find the players with highest wickets and then find player with highest run among those
 * @author bhavesh bhatt
 *
 */
public class MapSortTest {
	
	
	
	public static void main(String[] args) {
		 MapSortTest sortTest =  new MapSortTest();
		 Integer wkts = 300;
		 sortTest.sortMapByKey(wkts);
		 
	}
	/**
	 * sort a map by key
	 */
	public void sortMapByKey(int givenWkts) {
		Map<Integer,Set<Player>> map = populateMap();
	
		Map<Integer, Set<Player>> reverseSortedMap = map.entrySet().stream()
	            .sorted(Map.Entry.<Integer,Set<Player>>comparingByKey().reversed())
	            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		Optional<Map.Entry<Integer, Set<Player>>> highestWkts = reverseSortedMap.entrySet().stream().findFirst();
		
		Map<Integer, Set<Player>> sortedMap = map.entrySet().stream()
	            .sorted(Map.Entry.<Integer,Set<Player>>comparingByKey())
	            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		
		Optional<Map.Entry<Integer, Set<Player>>> lowestWkts = sortedMap.entrySet().stream().findFirst();

		if(highestWkts.isPresent()) {
			Integer wickets = highestWkts.get().getKey();
			Set<Player> players = highestWkts.get().getValue();
			System.out.println("players with highest wickets are ");
			for (Player player : players) {
				
				System.out.println("player name = " +player.getName());
				System.out.println("player wickets = " +player.getWickets());
				System.out.println("player runs = " +player.getRuns());
			}
			// player with maximum wickets and maximum runs
			Player maxPlayer = players.stream().max(Comparator.comparing(Player::getRuns)).get();
			System.out.println("player with highest wickets and highest run is ");
			
			System.out.println("player name = " +maxPlayer.getName());
			System.out.println("player wickets = " +maxPlayer.getWickets());
			System.out.println("player runs = " +maxPlayer.getRuns());
		}
		
		if(lowestWkts.isPresent()) {
			Integer wickets = lowestWkts.get().getKey();
			Set<Player> players = lowestWkts.get().getValue();
			System.out.println("players with lowest wickets are ");
			for (Player player : players) {
				
				System.out.println("player name = " +player.getName());
				System.out.println("player wickets = " +player.getWickets());
				System.out.println("player runs = " +player.getRuns());
			}
			// player with min wickets and min runs
			Player maxPlayer = players.stream().min(Comparator.comparing(Player::getRuns)).get();
			System.out.println("player with lowest wickets and lowest run is ");
			
			System.out.println("player name = " +maxPlayer.getName());
			System.out.println("player wickets = " +maxPlayer.getWickets());
			System.out.println("player runs = " +maxPlayer.getRuns());
		}
		
		
		
	}
	/** 
	 * sort a map by value
	 */
	public void sortMapByValue() {
		
	}
	public Map<Integer,Set<Player>> populateMap() {
		
		Set<Player> playerSet = populatePlayers();
		
		// wickets as key and players as value
		Map<Integer,Set<Player>> playerMap = new HashMap<Integer,Set<Player>>();
		for (Player player : playerSet) {
			
			if(playerMap.containsKey(player.getWickets())) {
				Set<Player> players = playerMap.get(player.getWickets());
				players.add(player);
				playerMap.put(player.getWickets(), players);
			} else {
				Set<Player> newPlayers = new HashSet<Player>();
				newPlayers.add(player);
				playerMap.put(player.getWickets(), newPlayers);	
			}
		}
		return playerMap;
	}
	/**
	 * populate different cricket players 
	 */
	private Set<Player> populatePlayers() {
		Player player1 = new Player("Anil",600,2000);
		Player player2 = new Player("Kapil",400,4000);
		Player player3 = new Player("Bedi",300,7000);
		Player player4 = new Player("Wasim",600,6000);
		Player player5 = new Player("Ashwin",350,3000);
		Player player6 = new Player("Imran",400,7000);
		Player player7 = new Player("Walsh",450,1500);
		Player player8 = new Player("Ambrose",500,2200);
		Player player9 = new Player("McGrath",550,1700);
		Player player10 = new Player("Warne",600,4500);
		Player player11 = new Player("marshall",100,9000);
		Player player12 = new Player("Saurav",200,10000);
		Player player13 = new Player("Jaysurya",400,12000);
		Player player14 = new Player("Rechards",150,7500);
		Player player15 = new Player("sachin",250,15000);
		Player player16 = new Player("vittori",100,2000);
		Set<Player> playerSet = new HashSet<Player>();
		playerSet.add(player1);
		playerSet.add(player2);
		playerSet.add(player3);
		playerSet.add(player4);
		playerSet.add(player5);
		playerSet.add(player6);
		playerSet.add(player7);
		playerSet.add(player8);
		playerSet.add(player9);
		playerSet.add(player10);
		playerSet.add(player11);
		playerSet.add(player12);
		playerSet.add(player13);
		playerSet.add(player14);
		playerSet.add(player15);
		playerSet.add(player16);
		return playerSet;
	}
	
}
