package PASTA;

public class TomatoPasta extends Pasta {
    public String itemName="토마토";
    public TomatoPasta(Pasta pasta) {
        super(pasta.name, pasta.description);
        System.out.println("[생성]" + name );
    }

    @Override
    public int cost() {
        return super.cost();
    }

    @Override
    public void advertise() {
        System.out.println("[파스타설명]");
        System.out.println("\t<"+itemName+ name + ">" +description + "(" + cost() + "원");


    }
}
