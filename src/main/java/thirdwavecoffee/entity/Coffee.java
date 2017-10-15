package thirdwavecoffee.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;

/**
 * Created by alp on 15.10.2017.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)

public class Coffee {
    private Long id;
    private String name;//Coffe Name
    private String region;//Which region Kenya etiophia etc.
    private String type;// arabica or robusta
    private String method;//v60 chemex aeropress etc
    private String description;//how did you make coffee
    private boolean milk;//Have in milk
    private String grindingtype;//espresso , filter or bigger  beans
    private int point = 0; // like points
    private int preptime; // preparation time like 3 min for this coffee

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public String getGrindingtype() {
        return grindingtype;
    }

    public void setGrindingtype(String grindingtype) {
        this.grindingtype = grindingtype;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPreptime() {
        return preptime;
    }

    public void setPreptime(int preptime) {
        this.preptime = preptime;
    }

    public Coffee() {

    }

    public Coffee(Long id, String name, String region, String type, String method, String description, boolean milk, String grindingtype, int point, int preptime) {

        this.id = id;
        this.name = name;
        this.region = region;
        this.type = type;
        this.method = method;
        this.description = description;
        this.milk = milk;
        this.grindingtype = grindingtype;
        this.point = point;
        this.preptime = preptime;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
