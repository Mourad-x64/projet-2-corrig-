package com.hemebiotech.analytics;

import java.util.Map;

public class AnalyticsCounter {


    public static void main(String args[])  {

        AnalyticsCounter counter = new AnalyticsCounter();

        counter.workflow();

    }

    public void workflow (){
        //programme réécrit
        ReadSymptomDataFromFile readFile = new ReadSymptomDataFromFile("symptoms.txt");
        Map<String, Integer> symptoms = CountSymptoms.getCountMap(readFile.getSymptoms());
        WriteSymptomDataToFile writeFile = new WriteSymptomDataToFile("result.out");
        writeFile.writeSymptoms(symptoms);

        //affichage dans la console
        for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
            String symptom = "number of "+entry.getKey()+" : "+entry.getValue();
            System.out.println(symptom);
        }
    }


}