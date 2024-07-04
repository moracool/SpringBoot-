package com.lmora.springboot.test.client_api.springboot_client.models;

import org.springframework.stereotype.Component;

@Component
public class Phones {

private String number;
private String citycode;
private String contrycode;

public Phones() {
}

public Phones(String number, String citycode, String contrycode) {
    this.number = number;
    this.citycode = citycode;
    this.contrycode = contrycode;
}

public String getNumber() {
    return number;
}
public void setNumber(String number) {
    this.number = number;
}
public String getCitycode() {
    return citycode;
}
public void setCitycode(String citycode) {
    this.citycode = citycode;
}
public String getContrycode() {
    return contrycode;
}
public void setContrycode(String contrycode) {
    this.contrycode = contrycode;
}


}
