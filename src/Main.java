public class Main {

    public static void main(String[] args) {
	int currentBalance = 100;
	int addedAmount = 1100;
    int bonus;

    if (addedAmount >= 1000){
        bonus = addedAmount / 100;
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
