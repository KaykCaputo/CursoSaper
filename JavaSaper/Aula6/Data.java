package Aula6;

public class Data {
    private int day,month,year;
    private boolean bissexto;
    public Data(int _day, int _month, int _year){
        if(_day<=31&&_month<=12 && _month>0 && _day>0 && _year>0){
            this.month = _month;
            this.year = _year;
            if(_year % 400 == 0){
                bissexto=true;
            } else if((_year % 4 == 0) && (_year % 100 != 0)){
                bissexto=true;
            }else{bissexto=false;}
            if(!bissexto){
                if(_day==31 && (this.month==4||this.month==6||this.month==9||this.month==11)){
                    System.out.println("Você inseriu 31 dias em um mês de apenas 30 dias, por isso o dia foi considerado 30");
                    this.day=30;
                }else if(this.month==2 && _day>28){
                    System.out.println("Você inseriu mais de 28 dias em fevereiro em um ano não bissexto, por isso o dia foi considerado 28");
                    this.day=28;
                }else{
                    day=_day;
                }
            }else{
                if(this.month==2||this.month==4||this.month==6||this.month==9||this.month==11 && _day==31){
                    System.out.println("Você inseriu 31 dias em um mês de apenas 30 dias, por isso o dia foi considerado 30");
                    this.day=30;
                }else{
                    day=_day;
                }
            }


        }else {
            System.out.println("A data é invalida!, data sera definida para os valores padrão");
            this.day = 1;
            this.month = 1;
            this.year = 2023;
            bissexto=false;
        }
    }

    public void setDay(int _day) {
        this.day = _day;
    }

    public void setMonth(int _month) {
        this.month = _month;
    }

    public void setYear(int _year) {
        this.year = _year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public void displayDate(){
        System.out.println(String.format("%d/%d/%d",this.day,this.month,this.year));
        if(bissexto){
            System.out.println("\nO Ano é bissexto");
        }else{
            System.out.println("\nO Ano não é bissexto");
        }

    }
}
