package neondb.parser;

public interface Statement {
    enum Type { SELECT, INSERT, CREATE_TABLE }
    Type getType();
}
