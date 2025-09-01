# Delivery Express

## Integrantes
- Santiago Getial Ayala
- Samuel Felipe Ibarra

## Cómo ejecutar
1. Clonar el repositorio:
   git clone https://github.com/SantiagoGetialAyala/delivery-express.git

2. Compilar y ejecutar desde la raíz del proyecto:

   Opción 1: Ejecutar directamente la clase Main.java .

   Opción 2: Usar Maven desde la terminal:
      mvn clean package
      java -cp demo/target/classes com.example.Main

   
## Explicación breve de cada parte

### Parte A – Listas
- Se usa ArrayList para registrar 5 pedidos en orden de llegada.
- Se insertan 2 pedidos urgentes al inicio.
- Se repite con LinkedList y se explica cuál conviene más si fueran 1000 pedidos urgentes.

### Parte B – Conjunto (HashSet)
- Se insertan pedidos incluyendo duplicados.
- Se observa que los duplicados no se almacenan.

### Parte C – Mapas (HashMap)
- Se indexan pedidos por cliente.
- Se muestran pedidos de un cliente específico.
- Se calcula el total gastado por cada cliente.

### Parte D – Genéricos
- Se implementa un método genérico `filtrar`.
- Se aplica para:
  - pedidos cuyo producto sea "Pizza"
  - pedidos con total mayor a $50

## Evidencia de ejecución
La evidencia de la consola se encuentra en el archivo:
demo/docs/evidencia_consola.txt
