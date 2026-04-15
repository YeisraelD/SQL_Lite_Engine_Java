package neondb.parser;

public class SelectStatement implements Statement {
    public String tableName;

    public SelectStatement(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public Type getType() { return Type.SELECT; }
}
