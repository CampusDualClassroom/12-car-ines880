package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", "Gasolina");

        // Encender el coche
        car1.start();

        // Acelerar y mostrar velocidad
        car1.accelerate();
        System.out.println("Velocidad actual: " + car1.speedometer + " km/h");

        // Girar el volante
        car1.turnAngleOfWheels(30);
        System.out.println(car1.showSteeringWheelDetail());

        // Activar marcha atrás
        car1.setReverse(true);
        System.out.println("Marcha atrás activada? " + car1.isReverse());

        // Frenar y apagar
        car1.brake();
        car1.stop();

        // Mostrar todos los detalles del coche
        car1.showDetails();
    }

    }

