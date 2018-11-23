package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.abstractions.Sweets;

import java.util.Objects;

public class Lollipop extends Sweets {
    private String taste;
;

    public Lollipop() {
    }

    public Lollipop(String name, double weight, double cost, double calories, String taste) {
        super(name, weight, cost, calories);
        this.taste = taste;

    }
    public Lollipop(Lollipop lollipop) {
        this(lollipop.getName(), lollipop.getWeight(),
                lollipop.getCost(),lollipop.getCalories(),lollipop.getTaste());
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Lollipop)) {
            return false;
        }
        Lollipop lollipop = (Lollipop) o;
        return Objects.equals(getTaste(), lollipop.getTaste());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaste());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", taste=" + getTaste() +
                '}';
    }
}
