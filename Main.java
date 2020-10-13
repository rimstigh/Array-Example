class Main {
  public static void main(String[] args) {
    /*
    double battingAvg[] = new double[28];

    for (int i = 0; i < battingAvg.length; i++) {
      battingAvg[i] = 0.0;
    }

    for (int i = 0; i < battingAvg.length; i++) {
      System.out.println(battingAvg[i]);
    }

    battingAvg[7] = .317;
    System.out.println(battingAvg[7]);

    for (int i = 0; i < battingAvg.length; i++) {
      System.out.println(battingAvg[i]);
    }
    */

    String cars[][] = { { "Ford", "BMW", "Mazda"}, {"Mustang", "Z4", "Miata"} };

    for (int i = 0; i < cars.length; i++) {
      for (int j = 0; j < cars[0].length; j++) {
        System.out.println(cars[i][j] + " ");
      }
    }

    for (int i = 0; i < cars.length; i++) {
      for (int j = 0; j < cars[0].length; j++) {
        System.out.print(cars[i][j] + "\t\t");
      }
      System.out.println();
    }

  }
}