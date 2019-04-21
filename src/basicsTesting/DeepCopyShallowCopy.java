package basicsTesting;

import java.util.Arrays;

public class DeepCopyShallowCopy extends Ex{

    static int[] vals = {3, 7, 9};
    public DeepCopyShallowCopy(){
        super(vals);
    }

    private static void showData(int[] vals) {
        int i = 0;
        while (i < vals.length) {
            System.out.println(vals[i]);
            i++;
        }
    }

    private static Widget[] widgets =
            {new Widget(2), new Widget(3),
                    new Widget(4)};


    public static void main(String[] args) {

        Ex ex = new Ex(vals, "deepCopy");
        vals[0] = 2;
        ex.showData();
        showData(vals);


        Widget[] shallow = Arrays.copyOf(widgets, widgets.length);
        for (int i = 0; i < shallow.length; i++) {
            System.out.println(shallow[i].dial);
        }
        widgets[0] = new Widget(100);

        for (int i = 0; i < widgets.length; i++) {
            System.out.println(widgets.hashCode());
            System.out.println(widgets[i].dial);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < shallow.length; i++) {
            System.out.println(shallow.hashCode());
            System.out.println(shallow[i].dial);
        }
        Widget[] shallowClone = shallow.clone();

    }
}
