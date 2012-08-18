/**
 * 
 */
package org.sudhcha.spring.neo4j;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * @author sudhin
 * 
 */
@NodeEntity
public class Movie {

	@GraphId
	Long nodeId;
	
	String title;
	
	int year;
	
	public Movie(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

}
