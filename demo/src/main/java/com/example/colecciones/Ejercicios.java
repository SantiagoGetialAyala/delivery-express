package com.example.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.modelo.Pedido;

public class Ejercicios {

    public static void parteA_Listas() {
        System.out.println("=== Parte A – Listas ===");

        // 1. ArrayList con 5 pedidos
        List<Pedido> pedidosArray = new ArrayList<>();
        pedidosArray.add(new Pedido("Ana", "Pizza", 40));
        pedidosArray.add(new Pedido("Luis", "Hamburguesa", 25));
        pedidosArray.add(new Pedido("Maria", "Sushi", 60));
        pedidosArray.add(new Pedido("Carlos", "Pizza", 55));
        pedidosArray.add(new Pedido("Sofia", "Ensalada", 20));

        System.out.println("Pedidos iniciales (ArrayList): " + pedidosArray);

        // 2. Insertar 2 urgentes al inicio
        pedidosArray.add(0, new Pedido("Pedro", "Hot Dog", 15));
        pedidosArray.add(0, new Pedido("Elena", "Pizza", 70));
        System.out.println("Con urgentes (ArrayList): " + pedidosArray);

        // 3. Repetir con LinkedList
        LinkedList<Pedido> pedidosLinked = new LinkedList<>(pedidosArray);
        pedidosLinked.addFirst(new Pedido("Miguel", "Tacos", 30));
        pedidosLinked.addFirst(new Pedido("Laura", "Pizza", 80));
        System.out.println("Con urgentes (LinkedList): " + pedidosLinked);

        System.out.println("Explicación: Para 1000 pedidos urgentes, LinkedList es más eficiente en inserciones al inicio, ya que no requiere mover todos los elementos como en ArrayList.");
    }

    public static void parteB_HashSet() {
        System.out.println("\n=== Parte B – Conjunto (HashSet) ===");

        Set<Pedido> pedidosSet = new HashSet<>();
        pedidosSet.add(new Pedido("Ana", "Pizza", 40));
        pedidosSet.add(new Pedido("Luis", "Hamburguesa", 25));
        pedidosSet.add(new Pedido("Maria", "Sushi", 60));
        pedidosSet.add(new Pedido("Ana", "Pizza", 40)); // duplicado

        System.out.println("Contenido del HashSet: " + pedidosSet);
        System.out.println("Explicación: Los duplicados no se almacenan en un HashSet. Solo se guarda un objeto único por sus reglas de hashCode/equals.");
    }

    public static void parteC_HashMap() {
        System.out.println("\n=== Parte C – Mapas (HashMap) ===");

        Map<String, List<Pedido>> pedidosPorCliente = new HashMap<>();

        pedidosPorCliente.put("Ana", Arrays.asList(
                new Pedido("Ana", "Pizza", 40),
                new Pedido("Ana", "Ensalada", 20)
        ));

        pedidosPorCliente.put("Luis", Arrays.asList(
                new Pedido("Luis", "Hamburguesa", 25),
                new Pedido("Luis", "Pizza", 55)
        ));

        pedidosPorCliente.put("Maria", Arrays.asList(
                new Pedido("Maria", "Sushi", 60),
                new Pedido("Maria", "Pizza", 80)
        ));

        // 3. Imprimir pedidos de un cliente
        String clienteBuscado = "Maria";
        System.out.println("Pedidos de " + clienteBuscado + ": " + pedidosPorCliente.get(clienteBuscado));

        // 4. Calcular total gastado
        for (String cliente : pedidosPorCliente.keySet()) {
            double total = pedidosPorCliente.get(cliente).stream()
                    .mapToDouble(Pedido::getTotal).sum();
            System.out.println("Total gastado por " + cliente + ": $" + total);
        }
    }

    public static void parteD_Genericos() {
        System.out.println("\n=== Parte D – Genéricos ===");

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Ana", "Pizza", 40));
        pedidos.add(new Pedido("Luis", "Hamburguesa", 25));
        pedidos.add(new Pedido("Maria", "Sushi", 60));
        pedidos.add(new Pedido("Carlos", "Pizza", 55));

        // a) Filtrar por producto "Pizza"
        List<Pedido> pizzas = Utilidades.filtrar(pedidos, p -> p.getProducto().equals("Pizza"));
        System.out.println("Pedidos de Pizza: " + pizzas);

        // b) Filtrar por total > 50
        List<Pedido> mayores50 = Utilidades.filtrar(pedidos, p -> p.getTotal() > 50);
        System.out.println("Pedidos mayores a $50: " + mayores50);
    }
}
