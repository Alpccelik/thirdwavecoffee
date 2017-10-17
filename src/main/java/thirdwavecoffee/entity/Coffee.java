package thirdwavecoffee.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by alp on 15.10.2017.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Coffee {
    @Id
    @GeneratedValue
    private Long id;

    private String name;//Coffe Name
    private String region;//Which region Kenya etiophia etc.
    private String type;// arabica or robusta
    private String method;//v60 chemex aeropress etc
    private String description;//how did you make coffee
    private boolean milk;//Have in milk
    private String grindingType;//espresso , filter or bigger  beans
    private Integer point = 0; // like points
    private Integer prepTime; // preparation time like 3 min for this coffee

    public Coffee() {
    }

    public Coffee(String name, String region, String type, String method, String description, boolean milk, String grindingType, Integer point, Integer prepTime) {
        this.name = name;
        this.region = region;
        this.type = type;
        this.method = method;
        this.description = description;
        this.milk = milk;
        this.grindingType = grindingType;
        this.point = point;
        this.prepTime = prepTime;
    }

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

    public String getGrindingType() {
        return grindingType;
    }

    public void setGrindingType(String grindingType) {
        this.grindingType = grindingType;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
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
