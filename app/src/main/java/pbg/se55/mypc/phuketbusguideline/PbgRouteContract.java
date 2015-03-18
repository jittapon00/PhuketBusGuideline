package pbg.se55.mypc.phuketbusguideline;

import android.provider.BaseColumns;

public final class PbgRouteContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public PbgRouteContract() {}

     /* Inner class that defines the table contents */
    public static abstract class RouteEntry implements BaseColumns {
         public static final String ROUTE_TABLE_NAME = "Route";
         public static final String ROUTE_COLUMN_NAME_BUS_STOP_ID = "BusStopId";
         public static final String ROUTE_COLUMN_NAME_BUS_STOP_NAME = "BusStopName";
         public static final String ROUTE_COLUMN_NAME_BUS_STOP_LATI = "BusStopLatitude";
         public static final String ROUTE_COLUMN_NAME_BUS_STOP_LNG = "BusStopLongitude";
         public static final String ROUTE_COLUMN_NAME_ROUTE_ID = "RouteId";
         public static final String ROUTE_COLUMN_NAME_ROUTE = "RouteLine";

         /*private static final String TEXT_TYPE = " TEXT";
         private static final String COMMA_SEP = ",";
         private static final String SQL_CREATE_ROUTE_TABLE = "";
         private static final String SQL_DELETE_ROUTE_TABLE = "";*/


     }
    public static abstract class LandmarkEntry implements BaseColumns{
        public static final String LANDMARK_TABLE_NAME = "Landmark";
        public static final String LANDMARK_COLUMN_NAME_LANDMARK_ID = "LandmarkId";
        public static final String LANDMARK_COLUMN_NAME_LANDMARK_NAME = "LandmarkName";
        public static final String LANDMARK_COLUMN_NAME_LANDMARK_LATS = "LandmarkLatitude";
        public static final String LANDMARK_COLUMN_NAME_LANDMARK_LAT = "LandmarkLongitude";

    }
}
