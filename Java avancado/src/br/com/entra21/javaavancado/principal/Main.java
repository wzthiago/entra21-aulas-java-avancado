package br.com.entra21.javaavancado.principal;

import java.util.Scanner;

import br.com.entra21.javaavancado.principal.Aula03.Aula03;
import br.com.entra21.javaavancado.principal.aula01.enums.PersonagemJogo;
import br.com.entra21.javaavancado.principal.aula02.collections.list.AprenderCollections;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;
	}

	public static void main(String[] args) {

		byte opcao = 0;

		do {

			System.out.println(exibirMenu());
			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo do programa...");
				break;
			case 1:
				aprenderWrapper();
				break;
			case 2:
				aprenderEnum();
				break;
			case 3:
				AprenderCollections.aprender();
				break;
			case 4:
				Aula03.aprender();
				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (opcao != 0);

	}

	private static String exibirMenu() {

		String menu = "Vamos aprender sobre conceitos avançados em JAVA!";
		menu += "\n 0 - Para  sair";
		menu += "\n 1 - Aprender Wrapper";
		menu += "\n 2 - Aprender ENUM";
		menu += "\n 3 - Aprender Collections-List";
		menu += "\n 4 - Anotações e datas";
		menu += "\n Escolha uma das opções";

		return menu;
	}

	private static void aprenderWrapper() {

		// conversores, converte para o tipo que pede
		char letra = Character.valueOf('T');
		boolean verdade = Boolean.parseBoolean("TRUE");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		// não recebeu um valor válido por isso da falso
		boolean falso = Boolean.parseBoolean("t");

		byte inteiro1 = Byte.parseByte("127");
		short inteiro2 = Short.parseShort("128");
		int inteiro3 = Integer.parseInt("10000");
		long inteiro4 = Long.parseLong("100000");

		float decimal1 = Float.parseFloat("1000.10");
		float decimal2 = Float.parseFloat("2200.20");

	}

	private static void aprenderEnum() {

		System.out.println("Testando Enum: " + DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SEGUNDA;
		System.out.println(hoje ? "sim" : "não"); // if ternário

		// 'values()' pega todos os atributos e transforma em um vetor
		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia + 1) + " - " + DiasSemana.values()[dia]);
		}

		// padrão do enum é mostrar o título dele
		System.out.println("Gosto desse tipo de personagem: " + PersonagemJogo.ANAO);
		System.out.println("Geralmente a classe " + PersonagemJogo.ANAO + " tem HP = " + PersonagemJogo.ANAO.getVIDA());
		System.out.println("Veja a caracteristica mais comum dele: " + PersonagemJogo.ANAO.getDESCRICAO());
		
		System.out.println("O mago está no índice do enum " +  PersonagemJogo.MAGO.ordinal() );
		System.out.println("Veja a descrição completa do: " + PersonagemJogo.MAGO + " sua vida é "
				+ PersonagemJogo.MAGO.getVIDA() + " e sua habilidade principal " + PersonagemJogo.MAGO.getDESCRICAO());

		System.out.println(PersonagemJogo.BARBARO.getDetails());
		
		System.out.println("");
		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {
			System.out.println(
					"Contador = " + personagem + " posição do enum = " + PersonagemJogo.values()[personagem].ordinal()); // (ordinal)para saber qual posição ele está
			System.out.println("O personagem " + PersonagemJogo.values()[personagem].name());
			System.out.println(PersonagemJogo.values()[personagem].getVIDA());
			System.out.println(PersonagemJogo.values()[personagem].getDESCRICAO());
			System.out.println("----------------------------------------------");
			
		        
		        for(PersonagemJogo variavel:PersonagemJogo.values() ) {
		        	System.out.println(variavel.ordinal() + " - " +variavel.getDetails());
		        }
		        System.out.println("");
		        System.out.println("O Druida esta na posicao "+PersonagemJogo.DRUIDA.ordinal());
			}
			
			
		}

	}

