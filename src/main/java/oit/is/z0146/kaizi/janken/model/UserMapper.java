package oit.is.z0146.kaizi.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  @Select("SELECT id,name from users where id = #{id}")
  User selectById(int id);

  @Select("SELECT * from users where id = #{id}")
  ArrayList<User> selectAllById(int id);

  /**
   * DBのカラム名とjavaクラスのフィールド名が同じ場合はそのまま代入してくれる（大文字小文字の違いは無視される）
   * カラム名とフィールド名が異なる場合の対応も可能だが，いきなり複雑になるので，selectで指定するテーブル中のカラム名とクラスのフィールド名は同一になるよう設計することが望ましい
   *
   * @return
   */
  //@Select("select user.USER,user.NUMBER,USERINFO.HEIGHT from user JOIN USERINFO ON user.USER=USERINFO.USER;")
  //ArrayList<userUser> selectAlluserUser();

  /**
   * #{user}などはinsertの引数にあるUseuserクラスのフィールドを表しています 引数に直接String userなどと書いてもいけるはず
   * 下記のOptionsを指定すると，insert実行時にAuto incrementされたIDの情報を取得できるようになる useGeneratedKeys
   * = true -> Keyは自動生成されることを表す keyColumn : keyになるテーブルのカラム名 keyProperty :
   * keyになるJavaクラスのフィールド名
   *
   * @param Useuser
   */
  //@Insert("INSERT INTO user (user,number) VALUES (#{user},#{number});")
  //@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
  //void insertuser(User user);

  //@Insert("INSERT INTO userinfo (user,height) VALUES (#{user},#{height});")
  //void insertUserInfo(UserInfo userinfo);

}
