public class Main {

    public static void main(String[] args) {
	int currentBalance = 200;
	int addedAmount = 900;
    int bonus;

    if (currentBalance + addedAmount >= 1000){
        bonus = (currentBalance + addedAmount) / 100;
        currentBalance += (addedAmount + bonus);
    }
    else {
        bonus = 0;
        currentBalance += addedAmount;
    }

        System.out.println("Your current balance is " + currentBalance);
        System.out.println("Your bonus is " + bonus);


    }
}
