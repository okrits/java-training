package de.abas.training.java.recursive;

public class MyMathUtils {
	public long fakultaet(long fakultaetVon) {
		if (fakultaetVon == 0 || fakultaetVon == 1) {
			return 1;
		} else {
			return fakultaetVon * fakultaet(fakultaetVon - 1);
		}
	}
}
