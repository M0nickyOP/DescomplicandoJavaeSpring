package day_10.queueJava;
import java.util.Comparator;
public class equipeComparator implements Comparator <Equipe> {
    @Override
    public int compare(Equipe equipe1, Equipe equipe2) {
        if (equipe1.saldoPontos < equipe2.saldoPontos) {
            return 1;
        } else if (equipe1.saldoPontos > equipe2.saldoPontos) {
            return -1;
        } else {
            return 0;
        }
    }
}

