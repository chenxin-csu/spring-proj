package test;

import org.springframework.stereotype.Component;

/**
 * Created by jackie on 2/15/16.
 */
@Component
public class CD1 implements CompactDisc {

	public void printCd() {
		System.out.println("CD1");
	}
}
