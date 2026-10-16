package model;

public class Category {
    private int id;
    private String name;
    private String type;

    // Constructors
    public Category() {}

    public Category(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Override toString() to display the name in UI components
    @Override
    public String toString() {
        return this.name;
}
}