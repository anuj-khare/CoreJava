package Domain;

import java.time.LocalDateTime;

public class FinTech {

    public Long id;
    public String Symbol;
    public Double prize;
    public String date;


    public FinTech(Long id,String Symbol,Double prize,String date){
        this.id = id;
        this.Symbol = Symbol;
        this.prize = prize;
        this.date = date;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FinTech{" +
                "id=" + id +
                ", Symbol='" + Symbol + '\'' +
                ", prize=" + prize +
                ", date='" + date + '\'' +
                '}';
    }
}
