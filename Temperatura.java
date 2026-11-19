void main() {
    double temp, sum = 0, count = 0, media = 0;

    temp = Double.parseDouble(IO.readln("Digite a temperatura °C: "));

    if (temp == 999) {
        IO.println("Digite uma temperatura válida pelo menos na primeira leitura (Que seja diferente de 999).");
    } 
    else {
        while (temp != 999) {
            sum = sum + temp;
            count ++;
    
            temp = Double.parseDouble(IO.readln("Digite a temperatura °C: "));
        }
    
        media = sum / count;
    
        if (media < 18) {
            IO.println("Temperatura Baixa: Ligar Aquecimento");
        } 

        else if (media >= 18 && media <= 28) {
            IO.println("Temperatura Ideal");
        } 

        else {
            IO.println("Temperatura Alta: Ligar Ventilação");
        }
    }
}