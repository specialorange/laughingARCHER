package eleven;

import static org.junit.Assert.*;
import eleven.Scanner;
import org.junit.Before;
import org.junit.Test;

public class ScannerTest {
	
	private Scanner s;
	
	@Before
	public void setUp() {
		s = new Scanner();
	}

	@Test
	public void testNextToken() {
		this.s.setOriginalString("  ah  ");
		assertTrue(this.s.nextToken() instanceof AddHouseWordToken );
	}

	@Test
	public void testNextTokenLonger() {
		this.s.setOriginalString("  mv  ");
		assertEquals("mv", this.s.nextToken());
	}

	@Test
	public void testNextTokenMultiple() {
		this.s.setOriginalString("  ah     mv          ");
		assertEquals("ah", this.s.nextToken());
		assertEquals("mv", this.s.nextToken());
	}
	@Test
	public void testCommandDetectorZeroParams() {
		this.s.setOriginalString("  ah     mv    100 -100      ");
		assertTrue(this.s.nextToken() instanceof AddHouseWordToken );
		assertTrue(this.s.nextToken() instanceof MoveWordToken );
	}
	@Test
	public void testCommandDetectorTwoParams() {
		this.s.setOriginalString("  ah     mv          ");
		assertEquals("ah", this.s.nextToken());
		assertEquals("mv", this.s.nextToken());
	}

}
