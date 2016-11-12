package database;

/**
 * Created by jhsoomro on 11/6/16.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String Name = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
