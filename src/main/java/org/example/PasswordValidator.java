package org.example;

public class PasswordValidator {

  public static final String 비밀번호는_최소_8_자_이상_이하여야_한다 = "비밀번호는 최소 8자 이상 이하여야 한다.";

  public static void validate(String password){
    int length = password.length();    // ctrl + Alt + V : extract variable

    if (length < 8 || length > 12){
      throw new IllegalArgumentException(WORNG);

    }





  }
}
