package com.example.modelo;

import java.util.Objects;

public class Pedido {
    private String cliente;
    private String producto;
    private double total;

    public Pedido(String cliente, String producto, double total) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", producto='" + producto + '\'' +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;
        Pedido pedido = (Pedido) o;
        return Double.compare(pedido.total, total) == 0 &&
                Objects.equals(cliente, pedido.cliente) &&
                Objects.equals(producto, pedido.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, producto, total);
    }
}
