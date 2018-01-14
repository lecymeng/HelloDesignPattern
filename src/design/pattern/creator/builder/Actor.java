package design.pattern.creator.builder;

public class Actor {
    private String type;
    private String face;
    private String sex;
    private String costume;
    private String hairStyle;

    public String getType() {
        return type;
    }

    public String getFace() {
        return face;
    }

    public String getSex() {
        return sex;
    }

    public String getCostume() {
        return costume;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }
}
