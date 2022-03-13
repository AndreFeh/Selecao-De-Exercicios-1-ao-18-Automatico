package com.andre.cursojavabasico.aula13;
import java.util.Scanner;
import java.lang.Math;

public class ExerciciosAula11a13 {

	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
			System.out.println("Escolha Um Número De Exercicio Entre 1 Ao 18: ");
				int numero = scan.nextInt();
		
		switch (numero) {
		case 1: {
			System.out.println("Exercicio 1: Alo Mundo");
				System.out.println("Alo Mundo");	
			break;
		}
		case 2: {
			System.out.println("Exercicio 2: Informe 2 Numeros");
	
			System.out.println("Informe um numero: ");
				int numero1 = scan.nextInt();
		
			System.out.println("Informe mais um numero: ");
				int numero2 = scan.nextInt();
	
			System.out.println("O numeros informados foram: " + numero1 + ", " + numero2);
			break;
		}
		case 3: {
			System.out.println("Exercicio 3: Calculo de 2 n°");

			System.out.println("Qual a soma pretendida? ");
					int soma1 = scan.nextInt();
					int soma2 = scan.nextInt();
					int resultado = soma1 + soma2;
						System.out.println("O resultado final é: " + soma1 + " + " + soma2 + " = " + resultado);
			break;
		}
		case 4: {
			System.out.println("Exercicio 4: Notas Bimestrais = Media");
				System.out.println("Digite sua nota1: ");
				float nota1 = scan.nextFloat();
				System.out.println("Digite sua nota2: ");	
				float nota2 = scan.nextFloat();
				System.out.println("Digite sua nota3: ");
				float nota3 = scan.nextFloat();
				System.out.println("Digite sua nota4: ");
				float nota4 = scan.nextFloat();
			
				System.out.println("Suas notas foram: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
				float resultado = (nota1 + nota2 + nota3 + nota4)/4;
			//	float media = resultado/4;
					System.out.println("Sua Média Final É: " + resultado);
			break;
		}
		case 5:{
			
			System.out.println("Exercicio 5: Metros em Centímetros");
				System.out.println("quandos Metros quer convertem em Centimetro?");
					float metro = scan.nextFloat();
					float centimetro = (metro)*100;
					System.out.println(metro + " Metro(s)" + " = " + centimetro + " Centimetros");
			break;
		}
		case 6: {
			System.out.println("Exercicio 6: Calculo do RAIO");
				System.out.println("Escreva o valor do Raio, e sua medida(mm, cm, dm, m, dam, hm, km)");
					double raio = scan.nextDouble();
					String medida = scan.nextLine();
					
					double area = Math.PI * (raio * raio);
					double circun = (2 * Math.PI) * raio ;
					double diametro = 2 * raio;
					System.out.println("O valor da área é: " + area + medida + "²");
					System.out.println("O valor do diametro é: " + diametro + medida + "²");
					System.out.println("O valor da circunferencia é: " + circun + medida + "²");
			break;
		}
		case 7: {
			System.out.println("Exercicio 7: Calculo Area");
				System.out.println("Com base em um dos lados" + "\n" + "Qual o valor da área que quer calcular? ");
					double lado = scan.nextInt();
			
					double area = (lado * lado);
						System.out.println("O valor da area é: " + area);
			break;
		}
		case 8: {
			System.out.println("Exercicio 8: Hora-Salario");
				System.out.println("Quanto você ganha por hora? ");
					float salarioHora = scan.nextFloat();
				System.out.println("Quantas horas trabalha no dia? ");
					float horasDia = scan.nextFloat();
				System.out.println("Quantos dias trabalha na semana? ");
					int diasSemana = scan.nextInt();
				System.out.println("Quantas dias trabalha no mês? ");
					int diasMes = scan.nextInt();
			
			//REUNINDO INFO.
					float horasSemanais= (horasDia * diasSemana);
					float horasMensais= (horasSemanais * diasMes);
					
					double salarioDiario = (salarioHora * horasDia);
					double salarioSemanal = (salarioDiario * diasSemana);
					double salarioMensal = (salarioDiario * diasMes);
			
			
					System.out.println("Você trabalha um total de " + horasSemanais + " horas semanais.");
					System.out.println("Você trabalha um total de " + horasMensais+ " horas mensais.");
					System.out.println("Seu Remuneratório Diário é:   " + salarioDiario);
					System.out.println("Seu Remuneratório Semanal é:  " + salarioSemanal);
					System.out.println("Seu Remuneratório Mensal é:   " + salarioMensal);
			break;
		}
		case 9: {
			System.out.println("Exercicio 9: converter F° para C°");
			
				System.out.println("Qual a temperatura em F°: ");
					float fahrenheit = scan.nextFloat();
			//		A base do Fahrenheit é 32 = 0 Graus
					
					double conversaoC = ((fahrenheit - 32)* 5/9);
					System.out.println("Temperatura em Fahrenheit(F°): " + fahrenheit + "\n" + "Convertida em Graus(C°): " + conversaoC);	
			break;
		}
		case 10: {
			System.out.println("Exercicio 10: converter C° para F°");
				System.out.println("Qual a temperatura em C°: ");
					float graus = scan.nextFloat();
			//		A base do Fahrenheit é 32 = 0 Graus - entao...
					
					double conversaoF = (graus * 5/9) + 32;
					System.out.println("Temperatura em Graus(C°): " + graus + "\n" + "Convertida em Fahrenheit(F°): " + conversaoF);	
			break;
		}
		case 11: {
			System.out.println("Exercicio 11: 2 números inteiros e 1 número real");
				System.out.println("Digite um numero inteiro: ");
					int number1 = scan.nextInt();
				System.out.println("Digite um numero inteiro: ");
					int number2 = scan.nextInt();
				System.out.println("Digite um numero real: ");
					float real = scan.nextFloat();
					
					int produto1 = (number1 * 2)/(number2);
					float produto2 =  (number1 * 3) + real;
					double produto3 = real * real * real;
						System.out.println ("(" + number1 + " X 2) " + " / " + number2 + " = " + produto1);
						System.out.println (number1 + " X 3" + " + " + real + " = " + produto2);
						System.out.println (real + " Elevado a 3" + " = " + produto3);
			break;
		}
		case 12: {
			System.out.println("Exercicio Extra: IMC");
				System.out.println ("Calculo com base em Seu Peso e Altura");
			
			System.out.println("Sua Altura: ");
				float altura = scan.nextFloat();
			System.out.println("Seu Peso: ");
				float peso = scan.nextFloat();
		
				System.out.println("PESO DIVIDIDO POR ALTURA²(ALTURAxALTURA)");
					float imc = peso / (altura * altura);
					System.out.println("Seu IMC é: " + imc);
			
					if (imc < 16.0) {
						System.out.println("Você está em Baixo peso muito grave: IMC abaixo de 16!");
						} else if (imc <= 16.99) {
							System.out.println("Você está em Grave: IMC entre 16 e 16,99;");
						} else if (imc <= 18.49) {
							System.out.println("Você está em Baixo peso: IMC entre 17 e 18,49");
						} else if (imc <= 24.99) {
							System.out.println("Você está com Peso normal: IMC entre 18,50 e 24,99");
						} else if (imc <=29.99) {
							System.out.println("Você está em Sobrepeso: IMC entre 25 e 29,99");
						} else if (imc <=34.99) {
							System.out.println("Você está em Obesidade Grau I: IMC entre 30 e 34,99");
						} else if (imc <= 39.99) {
							System.out.println("Você está em Obesidade Grau II: IMC entre 35 e 39,99");
						} else if (imc >= 40.0) {
							System.out.println("Você está em Obesidade Grau III (obesidade mórbida): IMC maior que 40");
						} else System.out.println("ERRO! Algum dado está incorreto! Tente Novamente");		
			break;
		}
		case 13: {
			System.out.println("Exercicio 12: Peso Ideal");
				System.out.println("Cálculo para seu peso ideal!!!");
				System.out.println("Sua Altura: ");
					float h = scan.nextFloat();	
			
					double pesoIdeal = (72.7 * h) - 58;
						System.out.println("Seu peso ideal é: " + pesoIdeal);
			break;
		}
		case 14: {
			System.out.println("Exercicio 14: peso > 50, excesso, multa");
				System.out.println("Quantidade de Peixes(em KG)");
					float pesca = scan.nextFloat();
				
					float pescaLimite = (pesca - 50);
					int multa = 4;
					float valorMulta = pescaLimite * multa;
					
					System.out.println("Você teve uma pesca de " + "KG " + pesca );
						if (pescaLimite > 0.0) {
							float totalPagar = valorMulta + pesca;
								System.out.println("Conforme regulamento de pesca do estado de São Paulo");
								System.out.println("Você deve pagar uma multa de: R$ " + multa + " Por quilo excedido!" + "\n" 
								+ "Multa = R$ " + valorMulta + "\n"
								+ "Totalizando: " + "R$ " + totalPagar);
								
						}else System.out.println("Você está dentro do estabelecido pelo regulamento");
			break;
		}
		case 15: {
			System.out.println("Exercicio 15: Salario");
				System.out.println("Ganha por hora: R$ ");
					float ganhoHora = scan.nextFloat();
				
					System.out.println("Horas Trabalhadas: ");
						float horasTrab = scan.nextFloat();
					
						System.out.println("Dias trabalhados na semana: ");
							double diasSemana = scan.nextDouble();
					
							System.out.println("Semanas no mês: ");
								double semanasMes = scan.nextDouble();
			
								double salarioBruto = ((ganhoHora * horasTrab)* diasSemana) * semanasMes;
			
								double infoImpostoDeRenda = 0.11;
								double infoInss = 0.08;
								double infoSindicato = 0.05;
						
								double impostoDeRenda = 0.11 * salarioBruto;
								double inss = 0.08 * salarioBruto;
								double sindicato= 0.05 * salarioBruto;
								double totalDescontos = infoImpostoDeRenda + infoInss + infoSindicato;
								double salarioLiqdo = salarioBruto - (salarioBruto * totalDescontos);
								
									System.out.println("Seu Salario Bruto é: R$ " + salarioBruto);
									System.out.println("- IR (11%): R$ " + impostoDeRenda + "\n"
													+ "- INSS (8%): R$ " + inss + "\n"
													+ "- Sindicato ( 5%): R$ " + sindicato);
									System.out.println("Seu Salario Líquido é: R$ " + salarioLiqdo);
			break;
		}
		case 16: {
			System.out.println("Exercicio 16: Calculo Loja de Tintas");
				System.out.println("Tamanho Do Espaço A Ser Pintado Em Metros²: ");
					float tamanhoArea = scan.nextFloat();
					
					double lataTinta = 18;
					int coberturaTinta = 3;
					int valorLata = 80;
					
						double metrosPorLitro = tamanhoArea / coberturaTinta;
						double qtdLatas = metrosPorLitro / lataTinta;	
					// CONVERTER PARA INTEIRO A QUANTIDADE DE LATAS 
						// EXEMPLO - int roundedNumA = (int)Math.ceil(a/100);
							
						int qtdLatasInt = (int)Math.ceil(qtdLatas);
							double valorTotal = qtdLatasInt * valorLata;
							
							System.out.println("Total De " + metrosPorLitro + " Litros! Para " + tamanhoArea + " m²");
							System.out.println("Total Exato De " + qtdLatas + " Latas Para Pintura!");
							System.out.println("Total De " + qtdLatasInt + " Lata(s) Para Pintura!");
							System.out.println("Valor Total: R$ " + valorTotal);
			break;
		}
		case 17: {
			System.out.println("Exercicio 17: Tanto Tintas Quanto Galões");
				System.out.println("Tamanho Do Espaço A Ser Pintado Em Metros²: ");
					float tamanhoArea = scan.nextFloat();
					
					double lataTinta = 18;
					double galoesTinta = 3.6;
				
					int valorGalao = 25;
					int valorLata = 80;
					
					int coberturaTinta = 6;
					
					double metrosPorLitro = tamanhoArea / coberturaTinta;
					double qtdLatas = metrosPorLitro / lataTinta;	
					double qtdGaloes = metrosPorLitro / galoesTinta;
					
				// CONVERTER PARA INTEIRO A QUANTIDADE DE LATAS 
					// EXEMPLO - int roundedNumA = (int)Math.ceil(a/100);
						
					int qtdLatasInt = (int)Math.ceil(qtdLatas);
						double valorTotalLata = qtdLatasInt * valorLata;
					
					int qtdGaloesInt = (int)Math.ceil(qtdGaloes);
						double valorTotalGalao = qtdGaloesInt * valorGalao;
					
						
						System.out.println("Total De " + metrosPorLitro + " Litros! Para " + tamanhoArea + " m²" + "\n");
						
						System.out.println("EM LATAS:");
						System.out.println("Total Exato De " + qtdLatas + " Latas Para Pintura!");
						System.out.println("Total De " + qtdLatasInt + " Lata(s) Para Pintura!");
						System.out.println("Valor Total: R$ " + valorTotalLata + "\n");	
			
						System.out.println("EM GALÕES:");
						System.out.println("Total Exato De " + qtdGaloes + " Galões Para Pintura!");
						System.out.println("Total De " + qtdGaloesInt + " Galão(ões) Para Pintura!");
						System.out.println("Valor Total: R$ " + valorTotalGalao + "\n");
						
			//			misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga 
			//			e sempre arredonde os valores para cima, isto é, considere latas cheias.
			//
			//			double metrosPorLitro = tamanhoArea / coberturaTinta;
			//			double faixaErro = 0.1;
			//			double qtdTotal = 0;
			//			int qtdTotalInt = (int)Math.ceil(qtdTotal);
			break;
		}
		case 18: {
			System.out.println("Exercicio 18: Tempo De Download");
				System.out.println("Qual o tamanho do arquivo em MB");
					double MB = scan.nextDouble();
					
					System.out.println("Velocidade da Internet em MBPS: ");
						double MBPS = scan.nextDouble();
						double megabytesPorSegundo = MBPS / 8;
						double tempo = MB / megabytesPorSegundo;
						double convertMin = tempo / 60;
						double convertHR = convertMin / 60;
						
							System.out.println(megabytesPorSegundo + " Megabytes por segundo.");
							System.out.println("Tempo Aproximado De Download Do Arquivo Usando Este Link \n");
			
			//				System.out.println("Total de " + tempo + " segundos");
			//				System.out.println("Total de " + convertMin + " minutos");
			//				System.out.println("Total de " + convertHR + " horas");
			
							System.out.println("Total em segundos: " + tempo);
							System.out.println("Total em minutos " + convertMin);
							System.out.println("Total em horas " + convertHR);
			break;
		}
			
					default:
						throw new IllegalArgumentException("Opção Inválida, digite as Opções de 1 a 18!" + numero);
		}
	}
}