import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aakash on 11/17/2016.
 */
public class test {
    public static void main(String[] args) {

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < (1 << 3); i++) {
            int temp = (i / 2) ^ i;
            res.add(temp);
        }
        for (Iterator<Integer> iterator = res.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();
            System.out.println("next = " + next);
        }
    }

    TreeNode[] serialize(TreeNode root) {
        TreeNode[] tn= new TreeNode[(int)Math.pow(2,4) - 1];
        tn[0] = root;
        for (int i = 0; i < tn.length; i++) {
            TreeNode temp = tn[i];
            if(temp != null) {
            /*    if (temp.left != null) {
                    tn[left(i)] = temp.left;
                }
            */}
        }
        return null;
    }

    int left(int i) {
        return i*2 + 1;
    }

    int right(int i) {
        return i*2 + 2;
    }
}
