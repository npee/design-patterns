package io.npee.designpatterns._10_iterator._03_improve_interface;

public class DinerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("베지테리안 BLT",
                "통밀 위에 식물성 베이컨, 양상추, 토마토가 올라감", true, 2.99);
        addItem("BLT",
                "통밀 위에 베이컨, 양상추, 토마토가 올라감", false, 2.99);
        addItem("오늘의 스프",
                "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
        addItem("핫도그",
                "사워크라우트, 조미료, 양파, 치즈 토핑이 들어간 핫도그",
                false, 3.05);
        addItem("데친 야치와 현미",
                "데친 야채와 현미", true, 3.99);
        addItem("파스타",
                "마리나라 소스를 사용한 스파게티와 사워도우 빵 한장",
                true, 3.89);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("메뉴가 꽉 찼습니다. 더 이상 메뉴를 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public CustomIterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
