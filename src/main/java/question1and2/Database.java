package question1and2;

public class Database {
    private Integer port;
    private String name;

    @Override
    public String toString() {
        return "question1and2.Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
