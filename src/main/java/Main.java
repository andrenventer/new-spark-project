import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        exception(Exception.class, (e, req, res) -> e.printStackTrace());
        staticFiles.location("/public");
        port(3000);

        get("/heading", (req, res) -> "<h1>Spark & Intercooler</h1>");

        get("/hello", (req, res) -> "<h1>Hello World</h1>");

    }
}