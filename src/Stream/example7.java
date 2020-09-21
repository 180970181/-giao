package Stream;

import java.io.*;
import java.util.StringTokenizer;

public class example7 {
    public static void main(String []args){
        File fi11=new File("D:\\File\\English.txt");
        File file2=new File("D:\\File\\EnglishCount.txt");
        try{
            Writer out=new FileWriter(file2);
            BufferedWriter bufferedWriter=new BufferedWriter(out);
            Reader in=new FileReader(fi11);
            BufferedReader bufferedReader=new BufferedReader(in);
            String str=null;
            while ((str=bufferedReader.readLine())!=null){
                StringTokenizer stringTokenizer=new StringTokenizer(str);
                int count=stringTokenizer.countTokens();
                str=str+" 句子中的单词个数："+count;
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            out.close();
            in=new FileReader(file2);
            bufferedReader=new BufferedReader(in);
            String s=null;
            System.out.println(file2.getName()+"内容：");
            while ((s=bufferedReader.readLine())!=null){
                System.out.println(s);
            }
            bufferedReader.close();
            in.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
