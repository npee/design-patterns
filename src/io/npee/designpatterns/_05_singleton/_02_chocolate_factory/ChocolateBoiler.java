package io.npee.designpatterns._05_singleton._02_chocolate_factory;

public class ChocolateBoiler {

	private static ChocolateBoiler uniqueInstance;

	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("새로운 인스턴스");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("인스턴스 반환");
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// 보일러에 우유/초콜릿을 혼합한 재료를 집어넣음
			System.out.println("Mix milk and chocolate");
			System.out.println("Fill boiler");
			System.out.println("====");
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
			// 끓인 재료를 다음 단계로 넘김
			System.out.println("Pass the boiled over");
			System.out.println("====");
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
			// 재료를 끓임
			System.out.println("Boil");
			System.out.println("====");
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
