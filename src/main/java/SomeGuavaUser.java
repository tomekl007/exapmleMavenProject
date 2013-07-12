import com.google.common.collect.ForwardingSortedSetMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.SortedSetMultimap;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 7/12/13
 * Time: 8:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class SomeGuavaUser {

    public static void main(String[] args){
        Multimap<String,Integer> map = new ForwardingSortedSetMultimap<String, Integer>() {
            @Override
            protected SortedSetMultimap<String, Integer> delegate() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }
        } ;

    }
}
