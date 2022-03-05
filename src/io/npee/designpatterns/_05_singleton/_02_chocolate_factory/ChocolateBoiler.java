package io.npee.designpatterns._05_singleton._02_chocolate_factory;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;

	public ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 보일러에 우유/초콜릿을 혼합한 재료를 집어넣음
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// 끓인 재료를 다음 단계로 넘김
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 재료를 끓임
			boiled = false;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
