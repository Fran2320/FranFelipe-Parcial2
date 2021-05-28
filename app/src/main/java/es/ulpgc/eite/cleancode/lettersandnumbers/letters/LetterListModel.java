package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.LetterData;

public class LetterListModel implements LetterListContract.Model {

  public static String TAG = LetterListModel.class.getSimpleName();

  private String data;
  private List<LetterData> objetosLetras;
  private char letra= 'A';

  public LetterListModel(String data) {
    objetosLetras = new ArrayList<>();
    this.data = data;
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public List<LetterData> getStoredDataSource() {
    // Log.e(TAG, "getStoredData()");
    return objetosLetras;
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
    LetterData item = createProduct();
    if(letra =='A'){
      item.letter = Character.toString(letra);
      objetosLetras.add(item);
    }else{
      item.letter = Character.toString(letra);
      objetosLetras.add(item);
    }
    letra++;
    //for(char letra = 'A';letra<'Z';letra++){
     // String let = Character.toString(letra);
     // item.letter = let;
    //}
    //item.letter = Character.toString(letra);
    //item.letter = "A";

    //objetosLetras.add(item);
  }

  private LetterData createProduct() {

    LetterData obj =new LetterData();
    return obj;
  }
}
