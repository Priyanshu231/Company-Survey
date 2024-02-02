package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg;
        int sum = 0;
        try {
            //Write the logic
            for(String rawData : ageRawData) {
                int age = Integer.parseInt(rawData);
                sum += age;
                count++;
            }
            avg = (double) sum/ageRawData.length;
            //Handle specific exception
        }catch (NumberFormatException exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }
}
