package month02.week02.JavaReadingMaterials;

public class JavaEx08 {
    public static void main(String[] args) {
        int[] ids = {101, 203, 155, 307, 422};
        int target = 155;
        int foundIndex = -1;
        for(int i = 0; i < ids.length; i++) {
            if (target == ids[i]) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("155 id ni " + foundIndex + " deh index-d bna");
        } else {
            System.out.println("155 id ni oldsongui");
        }
    }
}
