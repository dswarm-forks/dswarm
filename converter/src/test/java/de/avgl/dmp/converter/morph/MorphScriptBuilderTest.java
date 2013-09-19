package de.avgl.dmp.converter.morph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.avgl.dmp.persistence.mapping.JsonToPojoMapper;
import de.avgl.dmp.persistence.model.job.Job;
import de.avgl.dmp.persistence.util.DMPPersistenceUtil;

public class MorphScriptBuilderTest {

	@Test
	public void testRequestToMorph() throws Exception {

		final String request = DMPPersistenceUtil.getResourceAsString("complex-request.json");
		final String expected = DMPPersistenceUtil.getResourceAsString("complex-metamorph.xml");

		final Job job = new JsonToPojoMapper().toJob(request);
		final String actual = new MorphScriptBuilder().apply(job.getTransformations()).toString();

		assertEquals(expected, actual);
	}
}