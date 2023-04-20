package Rest;

public class Batterie
{
        private String bezeichnung = "";
        private double kapazitaet = 0.0;
        private double gesKap = 0.0;

        public Batterie()
        {
                this.bezeichnung = "Standardbatterie";
                this.kapazitaet = 80.0;
                this.gesKap = this.kapazitaet;
        }

        public Batterie(String bez, double kapazitaet)
        {
                this.bezeichnung = bez;
                this.kapazitaet = kapazitaet;
                this.gesKap = this.kapazitaet;
        }
        public void setKapazitaet(double kapazitaet) {
                this.kapazitaet = kapazitaet;
        }
        public double getKapazitaet()
        {
                return this.kapazitaet;
        }

        public void entladen(double prozent)
        {
                double einP = gesKap/100;
                double pAbzug = prozent * einP;
                this.kapazitaet = this.kapazitaet - pAbzug;
        }

        public boolean istLeer()
        {
                if(this.kapazitaet < 0.05)
                        return true;
                return false;
        }

        public String info()
        {
                String infStr = "";
                infStr += this.bezeichnung + " - " + this.kapazitaet + " Ah (";
                if(this.istLeer()) 
                {
                        infStr += "leer)";
                } else
                {
                        infStr += "voll)";
                }
                return infStr;
        }
}
