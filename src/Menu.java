import cabine.CabinModels;
import engine.Engine;
import engine.EngineModels;
import fuelTank.FuelTank;
import fuelTank.FuelTankModels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static String inputCabin() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a cabin model");

        while (true) {
            String userInput = in.nextLine();

            for (CabinModels cabin : CabinModels.values()) {
                if (cabin.getName().equals(userInput)) {
                    return cabin.getName();
                }
            }
            System.out.println("Invalid input. Try again");
        }
    }

    public static List<Engine> listOfInputEngines() {
        Scanner scanner = new Scanner(System.in);
        int iter = 0;
        List<Engine> enginesType = new ArrayList<>();
        System.out.println("Choose an engines models");
        while (iter < 3) {
            String choice = scanner.next();

            for (EngineModels engine : EngineModels.values()) {
                if (engine.getName().equals(choice)) {
                    Engine inputEngine = new Engine();
                    inputEngine.setName(engine.getName());

                    System.out.println("Choose a tank model");
                    String choice1 = scanner.next();

                    for (FuelTankModels tankModel: FuelTankModels.values()) {
                        if (tankModel.getName().equals(choice1)) {
                            inputEngine.setFuelTank(new FuelTank(tankModel.getName()));
                        }
                    }

                    enginesType.add(inputEngine);
                    System.out.println(enginesType);
                    iter++;
                }
            }
        }
        System.out.println("Press Y if you want more engines or any other key to stop");
        String yesOrNot = scanner.next();
        if(yesOrNot.equalsIgnoreCase("y")){
            System.out.println("adding more engines");
            System.out.println("Choose an engines models");
            while (iter <5) {
                String choice = scanner.next();
                for (EngineModels engine : EngineModels.values()) {
                    if (engine.getName().equals(choice)) {
                        enginesType.add(new Engine(engine.getName()));
                        System.out.println(enginesType);
                        iter++;
                    }
                }
            }

        }else {
            return enginesType;
        }
        return enginesType;
    }

    public static void inputFuelTank(Engine engine){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a tank model");
        String choice = scanner.next();

        for (FuelTankModels tankModel: FuelTankModels.values()) {
            if (tankModel.getName().equals(choice)) {
                engine.setFuelTank(new FuelTank(tankModel.getName()));
            }
        }



        }

    }



