package oit.is.z0146.kaizi.janken.model;

import java.util.ArrayList;

public class Janken {
  String namae;
  String hand;

  // コンストラクタ
  public Janken(String namae) {
    this.namae = namae;
  }

  public String getNamae() {
    return namae;
  }

  public void setNamae(String namae) {
    this.namae = namae;
  }

  public String getHand() {
    return hand;
  }

  public void setHand(String hand) {
    this.hand = hand;
  }

}
