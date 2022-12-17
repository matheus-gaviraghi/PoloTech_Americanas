package metodos;

public class ExercicioTimeZones_VersaoCompletaSimplificada {

	public static void main(String[] args) {


//      Scanner scanner = new Scanner(System.in);

      Horario tempo = new Horario();

      System.out.printf("hora: ");
//      tempo.hora = scanner.nextInt();
      System.out.println();

//      System.out.printf("minuto: ");
//      tempo.min = scanner.nextInt();
//      System.out.println();
//
//      System.out.printf("segundo: ");
//      tempo.seg = scanner.nextInt();
//      System.out.println();
//
//      System.out.printf("ano: ");
//      tempo.ano = scanner.nextInt();
//      System.out.println();
//
//      System.out.printf("mes: ");
//      tempo.mes = scanner.nextInt();
//      System.out.println();
//
//      System.out.printf("dia: ");
//      tempo.dia = scanner.nextInt();
//      System.out.println();

      tempo.ano = 2022;
      tempo.mes = 12;
      tempo.dia = 31;

      tempo.hora = 23;
      tempo.min = 59;
      tempo.seg = 59;


      imprimirData(tempo);

      //tempo.addAnos(2);
      //tempo.addMeses(255);
      //tempo.addDias(16);
      //tempo.addDias(80);
      //tempo.addHoras(27);
      //tempo.addMinutos(52);
      tempo.addSegundos(1);

      imprimirData(tempo);

  }

  public static void imprimirData(Horario tempo) {
      System.out.printf("%02d/%02d/%d %02d:%02d:%02d\n",
              tempo.dia, tempo.mes, tempo.ano, tempo.hora, tempo.min, tempo.seg);
  }

}

class Horario {
  int hora;
  int min;
  int seg;
  int ano;
  int mes;
  int dia;


  public void addSegundos(int segundos) {
      if (segundos > 0) {

          int novoSegundo = this.seg + segundos;

          if (novoSegundo >= 60) {
              int diffMinuto = novoSegundo / 60;
              addMinutos(diffMinuto);
          }

          this.seg = novoSegundo % 60;

      }
  }

  public void addMinutos(int minutos) {

      if (minutos > 0) {

          int novoMinuto = this.min + minutos;

          if (novoMinuto >= 60) {
              int difHora = novoMinuto / 60;
              addHoras(difHora);
          }

          this.min = novoMinuto % 60;

      }

  }

  public void addHoras(int horas) {
      if (horas > 0) {

          int novaHora = this.hora + horas;

          if (novaHora >= 24) {
              int difDias = (this.hora + horas) / 24;
              addDias(difDias);
          }

          this.hora = novaHora % 24;

      }
  }

  public void addDias(int dias) {
      if (dias > 0) {
          int novoDia = this.dia + dias;

          if (novoDia > qtdDiasMes()) {
              int diasMes = qtdDiasMes();

              while(novoDia > diasMes) {
                  addMeses(1);
                  novoDia -= diasMes;
                  diasMes = qtdDiasMes();
              }

          }
          this.dia = novoDia;
      }
  }

  public void addMeses(int meses) {
      if (meses > 0) {
          if ((this.mes + meses) > 12) {
              int difAnos = (this.mes + meses) / 12;
              addAnos(difAnos);
              int diferenca = (this.mes + meses) % 12;
              this.mes = diferenca;
          } else {
              this.mes += meses;
          }


      }
  }

  public void addAnos(int anos) {
      if (anos > 0) {
          this.ano += anos;
      }
  }

  private int qtdDiasMes() {
      return switch (this.mes) {
          case 1, 3, 5, 7, 8, 10, 12 -> 31;
          case 4, 6, 9, 11 -> 30;
          case 2 -> calcLeapYear();
          default -> -1;
      };
  }

  private int calcLeapYear() {
      if (((this.ano % 4 == 0) && !(this.ano % 100 == 0))
              || (this.ano % 400 == 0)) {
          return 29;
      }
      return 28;
  }
}
