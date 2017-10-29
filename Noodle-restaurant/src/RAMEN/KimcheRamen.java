package RAMEN;

public class KimcheRamen extends Ramen {

    final int kimcheCost= 1000;

    public KimcheRamen(Ramen ramen) {
        super(ramen.name, ramen.cost, ramen.description);
        System.out.println("[생성]" + " 김치 " + ramen.name);

    }

    @Override
    public int cost() {
        return super.cost() + kimcheCost; }

    @Override
    public void advertise() {
        System.out.println("[라면설명]");
        System.out.println("\t<김치" + name + ">" + description + "(" + cost() +"원 )");
    }
}
