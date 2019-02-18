package nl.han.ica.oose.dea;


public class StringCalculator {
    int sum = 0;

    public int add(String numbers) throws negativeNumberException {

        if ("".equals(numbers)) {
            return 0;
        } else if (numbers.contains(",") || numbers.substring(0, 2).equals("//")) {
            var regex = "[,\n]";

            if (numbers.substring(0, 2).equals("//")) {
                regex = "[" + numbers.substring(2, numbers.indexOf("\n")) + "]";
                numbers = numbers.substring(numbers.indexOf("\n") + 1, numbers.length() - (numbers.indexOf("\n" + 1) + 1));
            }

            String[] splits = numbers.split(regex);
            for (String number : splits) {
                addToSum(Integer.parseInt(number));
            }

            return sum;
        }
        return Integer.parseInt(numbers);
    }

    private void addToSum(Integer number) throws negativeNumberException {
        if (number < 0){
            throw new negativeNumberException(number);
        }
        sum += number;
    }


}
