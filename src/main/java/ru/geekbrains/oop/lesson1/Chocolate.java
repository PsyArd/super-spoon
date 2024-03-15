package ru.geekbrains.oop.lesson1;

public class Chocolate extends Product{
    
    
    private static  double weight; // объем
    private  double cocao; // % какао в шоколаде

    public static double getweight() {
        return weight;
    }

    public void setcacao(double cacao) {
        this.cocao = cacao;
    }

    public Chocolate(String brand, String name, double price, double weight, double cocao) {
        super(brand, name, price);
        this.cocao = cocao;
        Chocolate.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("Плитка шоколада\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tмасса: %.2f\n\t какао: %.2f]",
        brand, name, price, weight, cocao);
    }

}

