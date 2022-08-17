package cc.yunmc.dao.impl;

import cc.yunmc.dao.BookDao;
import org.springframework.stereotype.Component;

@Component("bookDao")
public class BookDaoImpl implements BookDao {

//    public BookDaoImpl(int connectionNum, String databaseName) {
//        this.connectionNum = connectionNum;
//        this.databaseName = databaseName;
//    }
//
//    private int connectionNum;
//    private String databaseName;
//

    @Override
    public void save() {
       // System.out.println("Book Dao save..." + databaseName + "," + connectionNum);
        System.out.println("Book Dao save...");
//        System.out.println("ArrayList" + Arrays.toString(array));
//        System.out.println("List" + list);
//        System.out.println("Set" + set);
//        System.out.println("Map" + map);
//        System.out.println("Properties" + properties);
    }

//    public void setArray(int[] array) {
//        this.array = array;
//    }
//
//    public void setList(List<String> list) {
//        this.list = list;
//    }
//
//    public void setMap(Map<String, String> map) {
//        this.map = map;
//    }
//
//    public void setSet(Set<String> set) {
//        this.set = set;
//    }
//
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }
//
//    private int[] array;
//    private List<String> list;
//    private Map<String,String> map;
//    private Set<String> set;
//    private Properties properties;


}
