
// interface
interface database {
    void connect();

    void disconnect();
}

class dataConnect implements database {

    @Override
    public void connect() {
        System.out.println("the data is connected into database");
    }

    @Override
    public void disconnect() {
        System.out.println("the connected data is disconnected from the existing database");
    }

}

public class DBMS {
    public static void main(String[] args) {
        dataConnect d = new dataConnect();
        boolean data = true;
        if (data) {
            d.connect();
        } else {
            d.disconnect();
        }

    }

}// output : the data is connected into database
