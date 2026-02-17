package day_14.textBlocks;

public class TextBlocksExample {
    public static void main(String[] args) {
        String sqlDepoisDoJava15 = """
                Select id, nome, endereco
                FROM estudante
                Where linguagem = java
                Order by nome
                """;
        System.out.println(sqlDepoisDoJava15);
    }
}
