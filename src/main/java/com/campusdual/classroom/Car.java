package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car (String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.speedometer = 0;
        this.tachometer = 0;
    }

    public Car(){
        this.brand = "Citroën";
        this.model = "Xsara";
        this.fuel = "Diesel";
        this.speedometer = 0;
        this.tachometer = 0;
    }

    public void start() {
        if (this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        }else{
            System.out.println("Vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("No se puede apagar el vehículo. Primero tiene que estar detenido");
        }
    }
    public void accelerate(){
        if (this.speedometer < MAX_SPEED){
            this.speedometer += 10;
            this.tachometer += 500;
            if (speedometer > MAX_SPEED) speedometer = MAX_SPEED;
            tachometer += 500;

        }
    }

    public void brake(){
        if (this.speedometer > 0){
            speedometer -= 10;
            if (speedometer < 0) speedometer = 0;
        }

    }


    public void turnAngleOfWheels(int angle){
        wheelsAngle += angle;
        if (wheelsAngle > 45) wheelsAngle = 45;
        if (wheelsAngle < -45) wheelsAngle = -45;

    }

    public String showSteeringWheelDetail(){

        return "Angulo actual del volante: " + wheelsAngle + "grados";
    }

    public boolean isReverse(){

        return reverse;
    }

    public void setReverse(boolean reverse){
       if ( speedometer == 0) {
           this.reverse = reverse;
           this.gear = reverse ? "R" : "N";
       }
    }

    public void showDetails(){
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Combustible: " + fuel);
        System.out.println("Velocidad: " + speedometer + " km/h");
        System.out.println("RPM: " + tachometer);
        System.out.println("Marcha: " + gear);
        System.out.println("Marcha atrás: " + reverse);
        System.out.println("Ángulo volante: " + wheelsAngle + "°");

    }

    public boolean isTachometerGreaterThanZero() {

        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {

        return this.tachometer == 0;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", "Gasolina");
        car1.start();
        car1.accelerate();
        car1.turnAngleOfWheels(30);
        car1.setReverse(true);
        car1.showDetails();
        car1.brake();
        car1.stop();

    }


}
