package day_14.records;

public class Main {
    public static void main(String[] args) {
        RecordExample depoisDoRecord = new RecordExample("Monicky", "Rua C", "1234");
        System.out.println(depoisDoRecord);
        System.out.println(depoisDoRecord.telefone().equals("1234"));
    }
}
