package com.xworkz.runner;


import com.xworkz.external.ExpressTrain;
import com.xworkz.internal.Train;

public class TrainRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Train train = new ExpressTrain();
            train.start();
            train.loadPassengers();
            train.announceStations();
            train.checkTickets();
            train.stop();

            System.out.println("\n=== Using Class Reference ===");
            ExpressTrain expressTrain = new ExpressTrain();
            expressTrain.start();
            expressTrain.loadPassengers();
            expressTrain.announceStations();
            expressTrain.checkTickets();
            expressTrain.stop();
        }
    }

