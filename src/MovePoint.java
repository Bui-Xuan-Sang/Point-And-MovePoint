public class MovePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovePoint() {
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] speed = {this.xSpeed, this.ySpeed};
        return speed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint move() {
        float x = super.getX();
        float y = super.getY();
        x += this.xSpeed;
        y += this.ySpeed;
        super.setX(x);
        super.setY(y);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "(" + this.xSpeed + "," + this.ySpeed + ")";
    }

}
