package pl.roka.it.lesson8.finalization;

public class SimpleObject {
    private String name;

    public SimpleObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "'s finalization");
        super.finalize();
    }
}
