import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> almacenamiento = new ArrayList<>();

        System.out.println("Ingrese el nombre de cada vertice (Digite "." para finalizar) : ");
        while (true) {
            String vertexName = sc.nextLine();

            if (vertexName.equals(".")) {
                break;
            } else {
                almacenamiento.add(vertexName);
            }
        }

        System.out.println("Todos los vertices estan conectados entre si ('SI/NO')(Escribir respuesta en mayuscula): ");
        String conectados = sc.next();

        if (conectados.equals("SI")) {
            System.out.println("Cada par de vertices es adyacente");
        }

        else {
            ArrayList<Integer> gradoVertices = new ArrayList<>();

            for (String vertice : almacenamiento) {
                System.out.println("A cuantos vertices esta conectado '"+ vertice +"' : ");
                int verticesConectados = sc.nextInt();
                gradoVertices.add(verticesConectados);
            }

            for(int i = 0 ; i < almacenamiento.size() ; i++) {
                for (int j = i + 1 ; j < almacenamiento.size(); j++) {
                    int sumGrados = gradoVertices.get(i) + gradoVertices.get(j);

                    if (sumGrados >= almacenamiento.size()) {
                        System.out.println(almacenamiento.get(i) + " y " + almacenamiento.get(j) + " NO son adyacentes");
                    } else {
                        System.out.println(almacenamiento.get(i) + " y " + almacenamiento.get(j) + " SI son adyacentes");
                    }
                }
            }
        }
    }
}
