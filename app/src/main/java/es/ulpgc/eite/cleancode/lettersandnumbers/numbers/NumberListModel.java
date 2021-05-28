package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.LetterData;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public class NumberListModel implements NumberListContract.Model {

  public static String TAG = NumberListModel.class.getSimpleName();

  private String data;
  private List<NumberData> datasource;
  int num;

  public NumberListModel(String data) {

    this.data = data;
    datasource = new ArrayList<>();
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    data = Integer.toString(num);
    return data;
  }

  @Override
  public List<NumberData> getStoredDataNumero() {
    // Log.e(TAG, "getStoredData()");
    return datasource;
  }

  @Override
  public int getStorednumClicks() {
    // Log.e(TAG, "getStoredData()");
    return num;
  }

  @Override
  public void setStorednumClicks( int numeClicks) {
    // Log.e(TAG, "getStoredData()");
    num=numeClicks;
  }

  @Override
  public void setDataSource( List<NumberData> lista) {
    // Log.e(TAG, "getStoredData()");
    datasource=lista;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
  }

  public void addProduct() {
    NumberData item = createProduct();
    num++;
    Integer numero = Integer.valueOf(num);
    item.number=numero;
    datasource.add(item);
  }

  private NumberData createProduct() {

    NumberData obj =new NumberData();
    return obj;
  }
}
