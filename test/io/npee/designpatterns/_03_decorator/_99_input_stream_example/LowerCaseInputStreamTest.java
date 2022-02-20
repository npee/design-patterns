package io.npee.designpatterns._03_decorator._99_input_stream_example;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class LowerCaseInputStreamTest {

	@Test
	void test() {
		int c;
		StringBuilder res = new StringBuilder();
		ClassLoader loader = LowerCaseInputStreamTest.class.getClassLoader();
		String path = loader.getResource("decorator/test.txt").getFile();
		try {
			LowerCaseInputStream in = new LowerCaseInputStream(
				new BufferedInputStream(
					new FileInputStream(path)
				)
			);

			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
				res.append((char) c);
			}

			assertEquals("i know the decorator pattern therefore i rule!", res.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}