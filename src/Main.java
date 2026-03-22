import java.util.*;

public class Main {
    public static void main(String[] args) {
      Map<String, Integer> estados = new LinkedHashMap<>();

        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);  

        estados.put("RN", 3534165);

        if (!estados.containsKey("PB")) {
            estados.put("PB", 4039277);
        }

        System.out.println("População de PE: " + estados.get("PE"));


        System.out.println("\nOrdem informada:");
        for (Map.Entry<String, Integer> entry : estados.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nOrdem alfabética:");
        Map<String, Integer> estadosOrdenados = new TreeMap<>(estados);
        for (Map.Entry<String, Integer> entry : estadosOrdenados.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        String menorEstado = Collections.min(estados.entrySet(), Map.Entry.comparingByValue()).getKey();
        int menorPop = estados.get(menorEstado);
        System.out.println("\nMenor população: " + menorEstado + " = " + menorPop); 


        String maiorEstado = Collections.max(estados.entrySet(), Map.Entry.comparingByValue()).getKey();
        int maiorPop = estados.get(maiorEstado);
        System.out.println("\nMaior população: " + maiorEstado + " = " + maiorPop);


        int soma = 0;
        for (int pop : estados.values()) {
            soma += pop;
        }
        System.out.println("\nSoma das populações: " + soma);

        double media = (double) soma / estados.size();
        System.out.println("Média das populações: " + media);


        System.out.println("\nRemovendo estados com população menor que 4 milhões...");
        Map<String, Integer> filtrado = new LinkedHashMap<>(estados);

        Iterator<Map.Entry<String, Integer>> iterator = filtrado.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 4000000) {
                iterator.remove();
            }
        }

        System.out.println("Após remoção:");
        for (Map.Entry<String, Integer> entry : filtrado.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        estados.clear();

        System.out.println("\nDicionário está vazio? " + estados.isEmpty());

    }
}
