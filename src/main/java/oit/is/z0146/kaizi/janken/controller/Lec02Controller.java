package oit.is.z0146.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import oit.is.z0146.kaizi.janken.model.Room;

@Controller
@RequestMapping("/lec02")
public class Lec02Controller {

  /**
   * lec02というGETリクエストがあったら，lec02()を呼び出して，lec02.htmlを返すメソッド
   *
   * @retur
   *
   * */

  @GetMapping("step1")
  public String lec02() {
    return "lec02.html";
  }

  //@GetMapping("/index")
  //public String index() {
  //  return "index.html";
  //}

  /**
   * クエリパラメータの引数2つを受け付ける URLでの?のあとのパラメータ名とjavaメソッドの引数名は同じであることが望ましい(別にする方法は一応ある)
   * 引数をStringとして受け取ってparseIntする以外にもInteger(intのラッパークラス)クラスの変数として受け取ってそのまま加算する方法もある
   *
   *
   * @param hand
   * @param model
   * @return
   */
  @GetMapping("/lec02janken")
  public String lec02janken(@RequestParam String hand, ModelMap model) {
    String JankenResult;
    if(hand.equals("Gu")){
      JankenResult = "Draw";
    }else if(hand.equals("Pa")){
      JankenResult = "You Win!";
    }else{
      JankenResult = "You Lose";
    }
    model.addAttribute("JankenResult", JankenResult);
    model.addAttribute("hand", hand);
    // ModelMap型変数のmodelにtasuResult2という名前の変数で，tasuResultの値を登録する．
    // ここで値を登録するとthymeleafが受け取り，htmlで処理することができるようになる
    return "lec02.html";

  }

  /**
   * POSTを受け付ける場合は@PostMappingを利用する /sample25へのpostを受け付けて，FormParamで指定された変数(input
   * name)をsample25()メソッドの引数として受け取ることができる
   *
   *
   * @param namae
   * @param model
   * @return
   */
  @PostMapping("/lec02")
  public String lec02(@RequestParam String namae,  ModelMap model) {
    model.addAttribute("namae", namae);
    return "lec02.html";
  }

}
