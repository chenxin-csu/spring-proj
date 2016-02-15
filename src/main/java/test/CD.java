package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jackie on 2/15/16.
 */
public class CD implements CompactDisc {

	private String name;
	private String body;

	@Autowired
	public CD(String name, String body) {
		this.name = name;
		this.body = body;
	}

	public void printCd() {
		System.out.println("CD");
	}
}
