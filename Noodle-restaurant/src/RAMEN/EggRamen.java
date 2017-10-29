package RAMEN;

public class EggRamen extends Ramen {

    final int eggcost = 500;
    final String itemName="계란";

    public EggRamen(Ramen ramen)  {
        super(ramen.name, ramen.cost, ramen.description);
        System.out.println("[생성]" + itemName + ramen.name);

    }

    @Override
    public int cost() {
        return super.cost() + eggcost;
    }

    @Override
    public void advertise() {
        System.out.println("[라면설명]");
        System.out.println("\t<"+ itemName + name + ">" + description + "(" + cost() +"원 )");

   }
}
