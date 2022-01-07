public class Rectangle {
    private float width;

    private float height;

    public Rectangle() {

    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea() {
        return this.width * this.height;
    }

    public float getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String toString() {
        return "Hình chữ nhật có chiều dài là " + this.height
                + ", chiều rộng là " + this.width
                + ",  diện tích là " + this.getArea()
                + ", chu vi là " + this.getPerimeter();

    }
}