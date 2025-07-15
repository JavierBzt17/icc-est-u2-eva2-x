package controllers;

import models.Book;

import java.util.*;

public class LibroController {

    public Set<Book> procesarLibros(List<Book> libros) {
        Comparator<Book> comparador = (b1, b2) -> {
            int compTitulo = b2.getTitulo().compareTo(b1.getTitulo()); // DESC
            if (compTitulo != 0) return compTitulo;

            int compAnio = Integer.compare(b1.getAnio(), b2.getAnio()); // ASC
            if (compAnio != 0) return compAnio;

            return 0;
        };

        Set<Book> conjuntoOrdenado = new TreeSet<>(comparador);
        conjuntoOrdenado.addAll(libros);
        return conjuntoOrdenado;
    }
}
