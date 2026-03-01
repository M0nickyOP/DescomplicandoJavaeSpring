package day_07.polimorfismo.sobrecarga;

public class Pagamento {

        public Double pagamento(Double valor) {
            return valor;
        }

        public Integer pagamento(Integer valorInteger, Integer parcelas) {
            return valorInteger / parcelas;
        }

        public Long pagamento(Integer valorInteger, Integer parcelas, Long juros) {
            return (valorInteger / parcelas) + juros;
        }

    }

