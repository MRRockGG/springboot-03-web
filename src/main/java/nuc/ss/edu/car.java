package nuc.ss.edu;

public class car {
    String carName;
    int carId;

    public car(String carName, int carId) {
        this.carName = carName;
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "car{" +
                "carName='" + carName + '\'' +
                ", carId=" + carId +
                '}';
    }
}
