import java.util.ArrayList;
import java.util.LinkedList;

public class datast {
    public static void main(String[] args) {
        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("mike");
        namelist.add("jon");
        namelist.add("crish");
        namelist.add("amr");
        for (int i=0;i<4;i++){
            System.out.println(namelist.get(i));
        }

        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("jon1");
        linkedList.add("mike2");
        linkedList.add("hasan3");
        linkedList.add("zund4");
        for (int a=0;a<4;a++){
            System.out.println(linkedList.get(a));
        }
    }
}
