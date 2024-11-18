package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

  public FreshMerchandise(String name, String uniqueId, String responsibleId) {
    super(name, uniqueId, responsibleId);
  }

  public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity) {
    super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
  }

  public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
    super(name, uniqueId, responsibleId, zone, area, shelf, quantity, expirationDate);
  }

  @Override
  public String getSpecificData() {
    return ("Location: " + getLocation() + "\nExpiration date: " + getFormattedDate(getExpirationDate()));
  }

  public void printSpecificData() {
    System.out.println(getSpecificData());
  }


}
