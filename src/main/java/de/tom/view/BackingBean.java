package de.tom.view;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import lombok.Data;

@ViewScoped
@Named
@Data
public class BackingBean implements Serializable {

 private  String helloText;

 @PostConstruct
 public void init() {
  helloText = "Hello World!!!!";
 }

 public void clearText() {
  helloText = "";
 }
}
