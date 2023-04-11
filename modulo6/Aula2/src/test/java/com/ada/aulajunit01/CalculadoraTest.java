package com.ada.aulajunit01;

import main.java.com.ada.aulajunit01.Calculadora;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Casos de teste do método somar
    // 1. 2 números positivos, sendo o primeiro maior que o segundo
    // 2. 2 números positivos, sendo o primeiro menor que o segundo
    // 3. 2 números de mesmo valor absoluto, mas sinais diferentes
    // 4. 2 números positivos iguais
    // 5. Primeiro negativo, segundo positivo
    // 6. Primeiro positivo, segundo negativo
    // 7. Zero e um número positivo
    // 8. Zero e um número negativo
    // 9. Número positivo e zero
    // 10. Número negativo e zero
    // 11. 2 números negativos, sendo o primeiro maior que o segundo
    // 12. 2 números negativos, sendo o primeiro menor que o segundo
    // 13. 2 números negativos iguais

    // Gherkhin - padrão para nomear testes

    private Calculadora calc;

    @BeforeAll
    public static void init(){
        System.out.println("Começando os testes!");
    }

    @BeforeEach
    public void before(){
        System.out.println("Iniciando o teste");
        calc = new Calculadora();
    }

    @AfterEach
    public void after(){
        System.out.println("Finalizando o teste");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Encerrando os testes!");
    }


    @Test
    public void dados2NumerosPositivos_quandoPrimeiroMaiorQueSegundo_entaoResultadoDeveSerPositivo(){
        //Antes
        int primeiro = 10;
        int segundo = 5;
        Assertions.assertTrue(primeiro>segundo,"Primeiro é maior que o segundo");
        //Durante
//        Calculadora calc = new Calculadora();
        int result = calc.somar(primeiro, segundo);

        //Depois
        //Assertions.assertTrue(result > 0);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void dados2NumerosPositivos_quandoPrimeiroMenorQueSegundo_entaoResultadoDeveSerPositivo(){
        //Antes
        int primeiro = 5;
        int segundo = 10;

        //Durante
        int result = calc.somar(primeiro, segundo);

        //Depois
        //Assertions.assertTrue(result > 0);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void dados2NumerosComMesmoValorAbsoluto_quandoComSinaisDiferentes_entaoResultadoDeveSerZero(){
        //Antes
        int primeiro = -5;
        int segundo = 5;

        //Durante
        int result = calc.somar(primeiro, segundo);

        //Depois
        //Assertions.assertTrue(result == 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void dados2NumerosPositivosIguais_entaoResultadoDeveSerOdobroDe1dosValores(){
        //Antes
        int primeiro = 5;
        int segundo = 5;

        //Durante
        int result = calc.somar(primeiro, segundo);

        //Depois
        //Assertions.assertTrue(result == primeiro*2);
        Assertions.assertEquals(10, result);
    }

    // 5. Primeiro negativo, segundo positivo
    @Test
    public void dados2Numeros_ondePrimeiroEhNegativoESegundoEhPositivoEMenor_entaoResultadoDeveSerNegativo(){
        //Antes
        int primeiro = -5;
        int segundo = 3;

        //Durante
        int result = calc.somar(primeiro, segundo);

        //Depois
        // Assertions.assertTrue(result < 0);
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void dadoZeroEPositivo_entaoResultadoEhPositivo(){
        //Antes
        int primeiro = 0;
        int segundo = 38;

        //Durante
        int result = calc.somar(primeiro, segundo);

        //Depois
        Assertions.assertEquals(segundo, result);
    }

    // 12. 2 números negativos, sendo o primeiro menor que o segundo
    @Test
    public void dados2Negativos_quandoPrimeiroMaiorQueSegundo_entaoResultadoNegativo(){
        int primeiro = -3;
        int segundo = -7;

        assertTrue(primeiro>segundo);

        int soma = calc.somar(primeiro, segundo);

        assertEquals(-10, soma);
    }

    @Test
    public void quandoDivisaoPorZero(){
        int numerador = 3;
        int denominador = 0;


        Exception e = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(numerador, denominador);
        });

        String msgEsperada = "/ by zero";
        assertEquals(msgEsperada, e.getMessage());
    }
}