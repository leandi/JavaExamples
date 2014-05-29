import java.util.*;
import java.io.*;

public class BranjePodatkov {

  private static boolean uspeh = true;

  public static int preberiInt() {
    int result = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    do {
      try {
        st = new StringTokenizer(br.readLine());
        result = Integer.parseInt(st.nextToken());
        uspeh = true;
      }
      catch(NumberFormatException nfe) {
        System.out.print("Napacen format stevila ! Ponovitev vnosa : ");
        uspeh = false;
      }
      catch(IOException ioe) {
        System.out.print("IO napaka pri branju stevila ! Ponovitev vnosa : ");
        uspeh = false;
      }
      catch(NoSuchElementException nsee) {
        System.out.print("Prazen vnos ! Ponovitev vnosa : ");
        uspeh = false;
      }
      catch(NullPointerException npe) {
        System.out.print("Prekinitev ! ");
        uspeh = false;
      }

    }
    while (! BranjePodatkov.uspeh);

    return result;
  }


  public static double preberiDouble() {
    double result = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    do {
      try {
        st = new StringTokenizer(br.readLine());
        result = new Double(st.nextToken()).doubleValue();
        uspeh = true;
      }

      catch(NumberFormatException nfe) {
        System.out.print("Napacen format stevila ! Ponovitev vnosa : ");
        uspeh = false;
      }
      catch(IOException ioe) {
        System.out.print("IO napaka pri branju stevila ! Ponovitev vnosa : ");
        uspeh = false;
      }
      catch(NoSuchElementException nsee) {
        System.out.print("Prazen vnos ! Ponovitev vnosa : ");
        uspeh = false;
      }
      catch(NullPointerException npe) {
        System.out.println("Prekinitev !");
        uspeh = false;
      }
    }
    while (! BranjePodatkov.uspeh);

    return result;
  }

  public static String preberiString() {
    String result = null;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    do {
      try {
        result = br.readLine();
        uspeh = true;
      }
      catch(IOException ioe) {
        System.out.print("IO napaka pri branju stringa ! Ponovitev vnosa : ");
        uspeh = false;
      }
    }
    while (! BranjePodatkov.uspeh);

    return result;
  }
}
