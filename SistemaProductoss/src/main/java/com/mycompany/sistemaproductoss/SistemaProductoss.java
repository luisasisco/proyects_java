package com.mycompany.sistemaproductoss;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaProductoss {
       private static Scanner scanner = new Scanner(System.in);

    private static List<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("-------MENU DE PRODUCTOS---------");
            System.out.println("1.Agregar producto");
            System.out.println("2.Mostrar todos los productos");
            System.out.println("3.Buscar producto por codigo");
            System.out.println("4.Eliminar producto");
            System.out.println("5.Salir");
            System.out.println("Por favor selecciona una opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarProducto();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                    break;
            }
        } while (option != 5);
        scanner.close();
    }

    private static void agregarProducto() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Selecciona el tipo de producto: ");
            System.out.println("1.Electronico");
            System.out.println("2.Alimento");
            System.out.println("3.Ropa");
            System.out.println("4.salir");
            System.out.println("Opcion: ");
            option = scanner.nextInt();
            
            if(option ==4){
                System.out.println("Saliendo del programa");
                break;
            }

            System.out.println("Nombre del producto");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("codigo del producto");
            int code = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Precio del producto");
            BigDecimal price = scanner.nextBigDecimal();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Estado del producto: ");
                    String state = scanner.nextLine();
                    System.out.println("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.println("Garantia(meses): ");
                    int garantia = scanner.nextInt();
                    scanner.nextLine();
                    productos.add(new Electronico(marca, garantia, name, state, code, price));
                    break;

                case 2:
                    System.out.println("Estado del producto: ");
                    state = scanner.nextLine();
                    System.out.println("Fecha de vencimiento(d-m-a) ");
                    String fechaVencimiento = scanner.nextLine();
                    System.out.println(" unidad de medida(kg/g) ");
                    String unidadMedida = scanner.nextLine();
                    productos.add(new Alimentos(fechaVencimiento, unidadMedida, name, state, code, price));
                    break;
                case 3:
                    System.out.println("Estado del producto: ");
                    state = scanner.nextLine();
                    System.out.println("Talla: ");
                    String talla = scanner.nextLine();
                    System.out.println("Material: ");
                    String material = scanner.nextLine();
                    productos.add(new Ropa(talla, material, name, state, code, price));
                    break;
                default:
                    System.out.println("Tipo no valido");
            }

            System.out.println("Producto agregado");
        } while (option <= 4);

    }

    public static void mostrarProducto() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados");
        } else {
            System.out.println("Lista de productos: ");
            for (Producto p : productos) {
                System.out.println(p.mostrarInfo());
            }
        }
    }

    public static void buscarProducto() {
        System.out.println("Ingrese el codigo del producto: ");
        String codigo = scanner.nextLine();

        for (Producto p : productos) {
            if (String.valueOf(p.getCode()).equalsIgnoreCase(codigo)) {
                System.out.println("Producto encontrado: " + p.mostrarInfo());
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    public static void eliminarProducto() {
        System.out.println("Ingrese el codigo del producto a eliminar: ");
        String code = scanner.nextLine();

        for (Producto p : productos) {
            if (String.valueOf(p.getCode()).equalsIgnoreCase(code)) {
                productos.remove(p);
                System.out.println("Producto eliminado");
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }
}
