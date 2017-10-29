package PASTA;

public class CreamPasta extends Pasta {
    public String itemName="크림";
    public CreamPasta(Pasta pasta) {
        super(pasta.name, pasta.description);

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
