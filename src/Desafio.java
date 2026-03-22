import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Desafio {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> lancamentos = new ArrayList<>();

        
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(6) + 1;
            lancamentos.add(numero);
        }

       
        Map<Integer, Integer> contagem = new HashMap<>();

        for (int num : lancamentos) {
            contagem.put(num, contagem.getOrDefault(num, 0) + 1);
        }

        
        System.out.println("Resultado dos lançamentos:\n");

        for (int i = 1; i <= 6; i++) {
            System.out.println("Número " + i + ": " + contagem.getOrDefault(i, 0) + " vezes");
        }
    }
}
  