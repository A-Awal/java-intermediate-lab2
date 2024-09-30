package org.example.design_patterns.factory_method;

public enum DbConnection {
    CIRCLE{
        @Override
        public DatabaseContext getConnection() {
            var con = new DatabaseContext();
            for (int i = 0; i < 10; i++) {
                con.add(new CircleEntity("circle"+i, i, i%2==0?"Male":"Female"));
            }
            return  con;
        }
    },
    SQUARE{
        @Override
        public DatabaseContext getConnection() {
            var con = new DatabaseContext();
            for (int i = 0; i < 10; i++) {
                con.add(new SquareEntity("square"+i, i, i%2==0?"Male":"Female"));
            }
            return  con;
        };
    };
    public abstract DatabaseContext getConnection();
}
