package org.example.design_patterns.factory_method;

public class Application {
    public static void main(String[] args) {
        //Create Shapes factory
        ShapesFactory factory = new ShapesFactory();

        //create circle connection
        DatabaseContext dbContextCircle = factory.getDatabaseContext(DbConnection.CIRCLE);
        Entity circle = dbContextCircle.get("circle2");
        System.out.println(circle);

        // get square connection
        DatabaseContext dbContextSquare = factory.getDatabaseContext(DbConnection.SQUARE);
        Entity square = dbContextSquare.get("square3");
        System.out.println(square);

    }
}
