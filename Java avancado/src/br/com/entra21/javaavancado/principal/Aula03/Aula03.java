package br.com.entra21.javaavancado.principal.Aula03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aula03 {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {
		byte opcao;
		do {
			System.out.println("1 - Sair de fininho");
			System.out.println("0 - Voltar");
			System.out.println("1 - Datas");
			System.out.println("2 - Anotações");
			opcao = input.nextByte();

			switch (opcao) {
			case -1:
				System.exit(3);// Exit retorna um valor para quem chamou o programa
				break;
			case 0:
				System.out.println("Retornando ao menu principal");
				break;
			case 1:
				aprenderDatas();
				break;
			case 2:

				break;
			default:
				break;
			}
		} while (opcao != 0);

	}

	private static void aprenderDatas() {

		Instant inicio = Instant.now();

		System.out.println("Escolha um numero aleatorio, menos esse que voce acabou de pensar");
		long numero = input.nextLong();

		Instant fim = Instant.now();
		Duration tempo = Duration.between(inicio, fim);
		System.out.println("Voce demorou " + tempo.toSeconds() + " segundos para escolher o numero " + numero);
		System.out.println("Para datas, levamos " + tempo.toSeconds() + " segundos");

		aprenderDatasHumanizadas();

	}

	private static void aprenderDatasHumanizadas() {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate nascimento = LocalDate.of(1900, 9, 02);
		System.out.println(nascimento);

		LocalDate essaQuinta = LocalDate.of(2022, Month.JUNE, 2);
		System.out.println("Essa quinta é igual a " + essaQuinta);

		// variavel para formatar a data
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println(formatter.format(hoje));
		System.out.println(DateTimeFormatter.ofPattern("YYYY").format(essaQuinta));

		Period vida = Period.between(nascimento, hoje);
		System.out.println("Durante minha vida já gastei " + vida.getYears() + " anos, " + vida.getMonths()
				+ " meses e " + vida.getDays() + " dias");

		LocalTime lanche = LocalTime.of(20, 10);
		LocalTime finalAula03 = LocalTime.of(22, 15);
		LocalTime avaliacao = LocalTime.of(22, 0);

		System.out.println("Fomos lanchar as: " + lanche + " vamos avaliar a aula as  " + avaliacao
				+ " e temos que aprender tudo até "+ finalAula03);
	}

}
