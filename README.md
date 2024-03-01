# Stistema de calendario usando padrão Strategy

O código funciona com a interface Estrategia, que faz a assinatura do método mensagemDoDia(), que por sua vez tem uma classe EstrategiaConcreta que implementa essa interface.

Com a implementação feita, a EstrategiaConcreta instância o GregorianCalendar e adiciona a variável DIA o valor do dia. Na mesma classe é criado um array com os nomes dos dias da semana.

O corpo do método mensagemDoDia() retorna a mensagem “hoje é” mais o dia correspondente a variável DIA. A utilização da array foi para diminuir os if e elses que poderiam aparecer no código.

A classe Contexto, ela apenas tem como objetivo colocar toda essa lógica em um método que tem como parâmetro uma variável do tipo Estrategia.

## Interface Estrategia
````
public interface Estrategia {
  public String mensagemDoDia();
}
````
## Classe EstrategiaConcreta
````
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EstrategiaConcreta implements Estrategia {
  private GregorianCalendar data = new GregorianCalendar();
  private int dia = data.get(Calendar.DAY_OF_WEEK);
  private String[] diaSemana = {"domingo", "segunda", "terca", "quarta", "quinta", "sexta", "sabado"};

  @Override
  public String mensagemDoDia(){
    return "hoje e " + diaSemana[dia-1];
  }
}
````
## Classe Contexto
````
public class Contexto {
  public String mensagemDoDia(Estrategia m){
    return m.mensagemDoDia();
  }
}
````
## Diagrama do código
![image](https://github.com/GustavoAnjos99/Padrao-Strategy-java/assets/132578544/f4cbaabd-af42-47d5-a89e-7d4ab01ebf05)


