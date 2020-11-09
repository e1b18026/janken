package oit.is.z0146.kaizi.janken.model;

public class User {
  int id;
  String name;
  //int number;

  // Thymeleafでフィールドを扱うためにはgetter/setterが必ず必要
  // vscodeのソースコード右クリック->ソースアクションでsetter/getterを簡単に追加できる
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //public int getNumber() {
  //  return number;
  //}

  //public void setNumber(int number) {
  //  this.number = number;
  //}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
