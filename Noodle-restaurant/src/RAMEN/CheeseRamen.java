package RAMEN;

public class CheeseRamen extends Ramen {
    final int Cheesecost= 500;
    final String itemName="치즈";

    public CheeseRamen(Ramen ramen) {
        super(ramen.name, ramen.cost, ramen.description);
        System.out.println("[생성]" +  itemName + ramen.name);
    }

    @Override
    public int cost() {
        return super.cost() + Cheesecost;
    }

    @Override
    public void advertise() {
        System.out.println("[라면설명]");
        System.out.println("\t<"+ itemName + name + ">" + description + "(" + cost() +"원 )");
    }
}
