import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    ConsultaMoneda consulta = new ConsultaMoneda();
    int opcion = 0;

    while (opcion != 7) {
      System.out.println("******************************************");
      System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
      System.out.println("1) Dólar =>> Peso argentino");
      System.out.println("2) Peso argentino =>> Dólar");
      System.out.println("3) Dólar =>> Real brasileño");
      System.out.println("4) Real brasileño =>> Dólar");
      System.out.println("5) Dólar =>> Peso colombiano");
      System.out.println("6) Peso colombiano =>> Dólar");
      System.out.println("7) Salir");
      System.out.print("Elija una opción válida: ");

      opcion = lectura.nextInt();

      if (opcion == 7) break;

      // Aquí llamamos a la lógica de conversión
      procesarConversion(opcion, consulta, lectura);
    }
    System.out.println("Finalizando el programa. ¡Gracias por usar nuestro conversor!");
  }

  private static void procesarConversion(int opcion, ConsultaMoneda consulta, Scanner lectura) {
    String base = "", destino = "";

    switch (opcion) {
      case 1 -> { base = "USD"; destino = "ARS"; }
      case 2 -> { base = "ARS"; destino = "USD"; }
      case 3 -> { base = "USD"; destino = "BRL"; }
      case 4 -> { base = "BRL"; destino = "USD"; }
      case 5 -> { base = "USD"; destino = "COP"; }
      case 6 -> { base = "COP"; destino = "USD"; }
      default -> {
        System.out.println("Opción no válida.");
        return;
      }
    }

    System.out.print("Ingrese el valor que desea convertir: ");
    double cantidad = lectura.nextDouble();

    try {
      Moneda moneda = consulta.buscarMoneda(base, destino);
      double resultado = cantidad * moneda.conversion_rate();
      System.out.println("El valor " + cantidad + " [" + base + "] corresponde al valor final de =>>> "
              + String.format("%.2f", resultado) + " [" + destino + "]");
    } catch (RuntimeException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}