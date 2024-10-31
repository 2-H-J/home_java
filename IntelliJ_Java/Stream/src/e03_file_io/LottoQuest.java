package e03_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.TreeSet;

public class LottoQuest {
    public static ArrayList<TreeSet<Integer>> createLotto(int set){
        ArrayList<TreeSet<Integer>> list = new ArrayList<TreeSet<Integer>>();
        Random r = new Random();

        while(list.size() < set) {
            TreeSet<Integer> s = new TreeSet<Integer>();
            while(s.size() < 6)
                s.add(r.nextInt(45)+1);
            list.add(s);
        }

        return list;
    }
    public static String makeLottoForm(ArrayList<TreeSet<Integer>> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%13s\n", "LOTTO"));
        sb.append("---------------------\n");
        //로또번호 넣음
        //숫자 무조건 2자리, 숫자간의 띄워쓰기 하나
        list.forEach(t -> {
            sb.append("  ");
            //한셋트 문자열로 붙임
            t.forEach(n -> sb.append(String.format("%2d ", n)));
            sb.append("\n");
        });
        sb.append("---------------------\n");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        sb.append(sdf.format(Calendar.getInstance().getTime()));
        return sb.toString();
    }

    public static void fileWrite(String result) {
        try(FileWriter fw = new FileWriter("lotto.txt");
            PrintWriter pw = new PrintWriter(fw,true);){
            pw.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayList<TreeSet<Integer>> list = createLotto(5);
        String r = makeLottoForm(list);
        System.out.println(r);
        fileWrite(r);

    }

}