package io.npee.designpatterns._05_singleton._01_classic;

public class Singleton {

	private static Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// 기타 메서드 (또는 분리)
}