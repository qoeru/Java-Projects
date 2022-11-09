public class Shape {
    protected String name;
    protected int perimeter;

    public Shape(String a_name, int a_perimeter) {
        name = a_name;
        perimeter = a_perimeter;
    }
    @Override
    public String toString(){
        return "Shape: {" + '\n'
                + "name = " + name + '\n' +
                "perimeter = " + perimeter + '\n' +
                '}';
    }

    public void setName(String a_name){
        name = a_name;
    }

    public void setPerimeter(int a_perimeter) {
        perimeter = a_perimeter;
    }

    public String getName() {
        return name;
    }

    public int getPerimeter() {
        return perimeter;
    }
}

