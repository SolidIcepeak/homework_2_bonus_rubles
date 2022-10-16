public class Main {
    public static void main(String[] args) {
        int Balance = -789; //Текущий баланс
        int BalanceRefill = 1489; //Сумма пополнения баланса
        int Bonus = 100; //Количество рублей, за которые выдается бонусный рубль сверх пополнения баланса
        int BalanceTotal = 0; //Итоговый Баланс
        if (BalanceRefill > 1000) {
            BalanceTotal = Balance + BalanceRefill + (BalanceRefill / Bonus);
        } else {
            BalanceTotal = Balance + BalanceRefill;
        } //Рассчет итогового баланса с пополнением и бонусными рублями
        System.out.println(BalanceTotal); //Вывод итогового баланса с пополнением и бонусными рублями
    }
}