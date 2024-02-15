package bean;

public class CarBean {
    private String name;
    private Integer id;
    private String color;
    private Boolean isStore;
    private Integer price;
    private Integer userId;

    public CarBean() {
    }

    public CarBean(String name, Integer id, String color, Boolean isStore, Integer price, Integer userId) {
        this.name = name;
        this.id = id;
        this.color = color;
        this.isStore = isStore;
        this.price = price;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getStore() {
        return isStore;
    }

    public void setStore(Boolean store) {
        isStore = store;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "CarBean{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", isStore=" + isStore +
                ", price=" + price +
                ", userId=" + userId +
                '}';
    }
}
