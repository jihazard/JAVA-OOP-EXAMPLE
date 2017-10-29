package RAMEN;/*oop연습
    1.나는 라면만 판다.
    2.무조건 2500원씩 받는다.

    라면액션 - 가격정산() , 라면설명()      -----인터페이스
    라면     - 이름,가격,설명               -----클래스

*/

public class Ramen implements RamenAction {

    protected  String name;
    protected  int cost;
    protected  String description;

    public Ramen(String name, int cost, String description){
        super();
        this.name=name;
        this.cost=cost;
        this.description=description;

        System.out.println("[생성]" + name);



    }

    public static void main(String[] args) {
        Ramen shin=new Ramen("신라면", 2500, "매운맛");
        Ramen jin=new Ramen("진라면", 2500, "순한맛");

        shin.advertise();
        jin.advertise();

        //신라면을 치즈라면으로
        CheeseRamen cramen = new CheeseRamen(shin);

        //진라명르 김치라면으로
        KimcheRamen kramen = new KimcheRamen(jin);

        cramen.advertise();
        kramen.advertise();
    }

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public void advertise() {
        System.out.println("[라면설명]");
        System.out.println("\t<" + name + ">" + description + "(" + cost +"원 )");

    }
}
