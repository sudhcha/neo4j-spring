


/**
 * 
 */
package org.sudhcha.spring.neo4j;

import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * @author sudhin
 *
 */
@NodeEntity
public class Character {
	
	@GraphId
	private Long nodeId;
	
	private String firstName;
	
	private String lastName;
	
	private char initial;
	
	@RelatedTo(type = "COMPANION_OF", direction = Direction.BOTH, elementClass = Character.class)
	private Set<Character> friends;
	
	@RelatedTo(type = "ENEMY_OF", direction = Direction.BOTH, elementClass = Character.class)
	private Set<Character> enemies;

	public Set<Character> getFriends() {
		return friends;
	}

	public void setFriends(Set<Character> friends) {
		this.friends = friends;
	}

	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Character(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getInitial() {
		return initial;
	}

	public void setInitial(char initial) {
		this.initial = initial;
	}
	
	public void friendOf(Character friend){
		this.friends.add(friend);
	}
	
}
