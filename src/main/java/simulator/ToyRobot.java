package simulator;

import exception.ToyRobotException;

public class ToyRobot {

    private Position position;

    public ToyRobot() {
    }

    public ToyRobot(Position position) {
        this.position = position;
    }

    public boolean setPosition(Position position) {
        if (position == null)
            return false;

        this.position = position;
        return true;
    }

    public boolean move() throws ToyRobotException {
        return move(position.getNextPosition());
    }

    public boolean move(Position newPosition) {
        if (newPosition == null)
            return false;

        this.position = newPosition;
        return true;
    }

    public Position getPosition() {
        return this.position;
    }

    public boolean rotateLeft() {
        if (this.position.direction == null)
            return false;

        this.position.direction = this.position.direction.leftDirection();
        return true;
    }

    public boolean rotateRight() {
        if (this.position.direction == null)
            return false;

        this.position.direction = this.position.direction.rightDirection();
        return true;
    }

}
