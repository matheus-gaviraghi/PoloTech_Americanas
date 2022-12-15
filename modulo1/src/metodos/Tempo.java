package metodos;

public class Tempo {
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minuto;
    private int segundo;
    private int diasDoMes;

    public void recalcularDiaDoMes(){
        switch (this.mes) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                this.diasDoMes = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                this.diasDoMes = 30;
                break;
            case 2:
                if (((this.ano % 4 == 0) &&
                        !(this.ano % 100 == 0))
                        || (this.ano % 400 == 0)) // checking for leap year
                    this.diasDoMes = 29;
                else
                    this.diasDoMes = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }

    @Override
    public String toString() {
        return "A data é: " + this.dia + "/" + this.mes + "/" + this.ano + "  " + this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public Tempo(int ano, int mes, int dia, int hora, int minuto, int segundo) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

        switch (this.mes) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                this.diasDoMes = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                this.diasDoMes = 30;
                break;
            case 2:
                if (((this.ano % 4 == 0) &&
                        !(this.ano % 100 == 0))
                        || (this.ano % 400 == 0)) // checking for leap year
                    this.diasDoMes = 29;
                else
                    this.diasDoMes = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }

    public void recalcularSegundo(){
        while(this.segundo>59){
            this.minuto+=1;
            this.segundo-=60;
        }
    }

    public void recalcularMinuto(){
        while(this.minuto>59){
            this.hora+=1;
            this.minuto-=60;
        }
    }

    public void recalcularHora(){
        while(this.hora>23){
            this.dia+=1;
            this.hora-=24;
        }
    }

    public void recalcularDia(){
        while(this.dia>this.diasDoMes){
            this.mes+=1;
            if(this.mes>12){
                this.mes-=12;
                this.ano+=1;
            }
            this.dia-=this.diasDoMes;
            this.recalcularDiaDoMes();
        }
    }

    public void recalcularMes(){
        while(this.mes>12){
            this.mes -= 12;
            this.ano += 1;
        }
        this.recalcularDiaDoMes();
        this.recalcularDia();
    }

    public void recalcularAno(){
        this.recalcularDiaDoMes();
        this.recalcularDia();
    }

    public void addValue(String value){
        char code = value.charAt(value.length()-1);
        String numberString = value.substring(0,value.length()-1);
        int correctNumber = Integer.parseInt(numberString);

        switch (code){
            case 'y':
                this.ano += correctNumber;
                break;
            case 'm':
                this.mes += correctNumber;
                break;
            case 'd':
                this.dia += correctNumber;
                break;
            case 'h':
                this.hora += correctNumber;
                break;
            case 'M':
                this.minuto += correctNumber;
                break;
            case 's':
                this.segundo += correctNumber;
                break;
        }

        this.recalcularSegundo();
        this.recalcularMinuto();
        this.recalcularHora();
        this.recalcularDia();
        this.recalcularMes();
        this.recalcularAno();
    }
}