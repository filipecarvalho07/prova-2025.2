public class questaoC {
    
    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
    int tamVSR = 0;

    for (int i = 0; i < tamV; i++) {
        if (!pertence(vsr, tamVSR, v[i])) {
            vsr[tamVSR] = v[i];
            tamVSR++;
        }
    }

    return tamVSR;
}




public static boolean pertence(int[] v, int tam, int valor) {
    for (int i = 0; i < tam; i++) {
        if (v[i] == valor) {
            return true;
        }
    }

    return false;
}

}

// tempo para fazer o código: 10 minutos