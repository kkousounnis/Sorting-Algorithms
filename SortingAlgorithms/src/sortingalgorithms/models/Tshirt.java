package sortingalgorithms.models;

public class Tshirt {

    private String name;
    private Color color;
    private Size size;
    private Fabric fabric;

    public Tshirt() {
    }

    public Tshirt(String name, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.fabric = fabric;

    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tshirt{Name=").append(name);
        sb.append(", color=").append(color);
        sb.append(", size=").append(size);
        sb.append(", fabric=").append(fabric);
        sb.append('}');
        return sb.toString();
    }

}
