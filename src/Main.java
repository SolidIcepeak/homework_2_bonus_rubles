public class Main {
    public static void main(String[] args) {
        int balance = -789; //Текущий баланс
        int balancerefill = 1489; //Сумма пополнения баланса
        int bonus = 100; //Количество рублей, за которые выдается бонусный рубль сверх пополнения баланса
        int balancetotal = 0; //Итоговый Баланс
        if (balancerefill > 1000) {
            balancetotal = balance + balancerefill + (balancerefill / bonus);
        } else {
            balancetotal = balance + balancerefill;
        } //Рассчет итогового баланса с пополнением и бонусными рублями
        System.out.println(balancetotal); //Вывод итогового баланса с пополнением и бонусными рублями
    }
}
