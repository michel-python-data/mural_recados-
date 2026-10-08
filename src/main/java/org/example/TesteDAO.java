package org.example;

import java.sql.SQLException;

public class TesteDAO {

    public static void main (String[] args) {
        try {
            System.out.println("Iniciando o teste do DAO...");

            RecadoDAO dao = new RecadoDAO();

            System.out.println("Tentando cadastrar recado...");
            dao.cadastrar(new Recado(0,"Professor","teste feito com sucesso"));

            System.out.println("Tentando listar recados...");
            for(Recado recado: dao.listar()) {
                System.out.println(recado.getAutor() + ":" + recado.getMensagem());
            }

            System.out.println("Sucesso absoluto!");

        } catch (Exception e) {
            System.err.println("\n--- O ERRO REAL APARECEU AQUI EMBAIXO: ---");
            e.printStackTrace(); // Isso vai mostrar a linha exata que falhou
            System.err.println("-----------------------------------------\n");
        }
    }
}
