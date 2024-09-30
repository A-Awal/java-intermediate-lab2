package org.example.design_patterns.factory_method;

public class ShapesFactory {

   public DatabaseContext getDatabaseContext( DbConnection dbConnection ) {
      return dbConnection.getConnection();
   }



//    public  T getShape( Class<T> toInstatiate) throws InstantiationException, IllegalAccessException {
//        T shape = toInstatiate.newInstance();
//        return shape;
//    }

}
