package org.example;

import entities.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\vitin\\IdeaProjects\\ExercicioLambda1\\contato.csv";
        List<Person> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double value = Double.parseDouble(fields[2]);
                list.add(new Person(name, email,value));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lista de empregado: ");
        list.forEach(System.out::println);

        System.out.println("Digite o salario que deseja filtrar: ");
        Double filtro = sc.nextDouble();

        List<String> emails = list.stream().filter(x -> x.getValue() > filtro).map(x -> x.getEmail()).toList();
        Double sum = list.stream().filter(x -> x.getName().toUpperCase().charAt(0) == 'M').map(x -> x.getValue()).reduce(0.0, (x, y) -> x + y);
        System.out.println("Emails: ");
        emails.forEach(System.out::println);
        System.out.println("Soma dos salario das pessoas que comecam com a letra 'M':  "  + sum);
    }
}