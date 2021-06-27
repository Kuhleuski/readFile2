package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src\\com\\company\\data\\input_task47.txt"));
        String s = br.readLine();
        br.close();
        System.out.println(s);

        char[]c={'.',',','-',':',';','?','!'};
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<c.length;j++){
                if(s.charAt(i)==c[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println("Знаков припенания: "+ count );




        int count2 = 0, sum=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("Сумма всех чисел в файле равна: " + sum ); // выводит сумму чисел однозначных только



        try(FileWriter writer = new FileWriter("src\\com\\company\\data\\output_task48.txt", false))
        {
            // запись всей строки
            String text1 = "Знаков припенания: " + count ;
            String text2 = "Сумма всех чисел в файле равна:  " + sum;
            writer.write(text1);
            writer.append('\n');
            writer.write(text2);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }






    }


}



///C:\Users\S\IdeaProjects\readFile3\