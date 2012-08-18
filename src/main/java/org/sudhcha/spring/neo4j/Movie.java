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
	String id;
	String title;
	int year;

}
