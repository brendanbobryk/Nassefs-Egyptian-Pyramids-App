package com.example;

// pyramid class, that corresponds to the information in the json file
public class Pyramid {

  protected Integer id;
  protected String name;
  protected Pharaoh[] contributors;

  // constructor
  public Pyramid(
      Integer pyramidId,
      String pyramidName,
      Pharaoh[] pyramidContributors) {
    id = pyramidId;
    name = pyramidName;
    contributors = pyramidContributors;
  }

  // print pyramid
  public void print() {
    int totalGold = 0;
    System.out.printf("Pyramid %s\n", name);
    System.out.printf("\tid: %d\n", id);
    for (int i = 0; i < contributors.length; i++) {
      System.out.println(
          "\tcontributor " + (i + 1) + ": " + contributors[i].name + " " + contributors[i].contribution
              + " gold coins");
      totalGold += contributors[i].contribution;
    }
    System.out.printf("\ttotal contribution: " + totalGold + " gold coins\n");
  }
}
