package io.npee.designpatterns._05_singleton._03_thread_safety;

public class ThreadSafeChocolateBoilerV1 extends Thread {

	private static ThreadSafeChocolateBoilerV1 uniqueInstance;

	private boolean empty;
	private boolean boiled;

	private ThreadSafeChocolateBoilerV1() {
		this.empty = true;
		this.boiled = false;
	}

	public static synchronized ThreadSafeChocolateBoilerV1 getInstance() {
		if (uniqueInstance == null) {
			System.out.println("새로운 인스턴스");
			uniqueInstance = new ThreadSafeChocolateBoilerV1();
		}
		System.out.println("인스턴스 반환");
		return uniqueInstance;
	}

	public void fill() throws InterruptedException {
		Thread.sleep(1000);
		if (isEmpty()) {
			empty = false;
			// 보일러에 우유/초콜릿을 혼합한 재료를 집어넣음
			System.out.println("Mix milk and chocolate");
			System.out.println("Fill boiler");
			System.out.println("====");
		} else {
			throw new IllegalStateException("보일러에 재료가 이미 들어있습니다.");
		}
	}

	public void drain() throws InterruptedException {
		Thread.sleep(1000);
		if (!isEmpty() && isBoiled()) {
			empty = true;
			boiled = false;
			// 끓인 재료를 다음 단계로 넘김
			System.out.println("Pass the boiled over");
			System.out.println("====");
		} else {
			throw new IllegalStateException("보일러가 끓지 않았습니다.");
		}
	}

	public void boil() throws InterruptedException {
		Thread.sleep(1000);
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
			// 재료를 끓임
			System.out.println("Boil");
			System.out.println("====");
		} else {
			throw new IllegalStateException("보일러가 준비되지 않았습니다.");
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	@Override
	public void run() {
		synchronized (uniqueInstance) {
			try {
				fill();
				boil();
				drain();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
