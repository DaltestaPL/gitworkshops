

public class Human {
    public final String name;
    public final String sex;
    public final int age;
    public final int weight;
    public final int height;

    public Human (String name, String sex, int age, int weight, int height) {
        //requireNonNulls( );
        //checkArgument(price.compareTo(BigDecimal.ZERO) > 0, "Wrong price");
        //checkArgument(quantity > 0, "Wrong quantity");
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height= height;
    }

    public String getName() {
        return name;
    }
    public String getSex() {return sex;}
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
