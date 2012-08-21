package org.sudhcha.spring.neo4j;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = "classpath:/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CharacterTest {
	
	@Autowired
	Neo4jTemplate template;

	@Test
	@Transactional
	public void shouldCreateSomePropertiesOnANode() {
		Character theDoctor = template.save(new Character("William", "Hartnell"));
		Character retrievedDoctor = template.findOne(theDoctor.getNodeId(),
				Character.class);
		assertEquals("retrieved character first name matches", "William",
				retrievedDoctor.getFirstName());
		assertEquals("retrieved character last name matches", "Hartnell",
				retrievedDoctor.getLastName());
	}

}
