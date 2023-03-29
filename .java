public class SumaDeTresNumeros{
 public static void main(String[] args) {
  int num1 = 3;
  int num2 = 6;
  int num3 = 16;
  int resultado = sumarTresNumeros(num1, num2, num3);
  System.out.println("La suma de los tres números es: " + resultado);
 }
 
public static int sumarTresNumeros(int num1, int num2, int num3){
return num1 + num2 +num3;
 }
}
