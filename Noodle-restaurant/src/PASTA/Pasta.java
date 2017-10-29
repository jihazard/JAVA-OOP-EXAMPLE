package PASTA;
/*
* 파스타 레스토랑 연습
* 파스타 메뉴를 추가한다.
* 파스타 메뉴는 5000원이다.
*
* */
public class Pasta implements PastaAction {

    protected  String name;
    protected  int cost;
    protected  String description;


    public Pasta(String name, String description){
        super();
        this.name=name;
        this.cost=5000;
        this.description=description;

    }

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public void advertise() {

    }
}
