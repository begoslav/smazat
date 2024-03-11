public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;
    public abstract void pohladit();

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
