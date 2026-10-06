public class questaoA {

    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;

        for (int i = 0; i < tamA; i++) {
            if (!pertence(u, tamU, a[i])) {
                u[tamU] = a[i];
                tamU++;
            }
        }

        for (int i = 0; i < tamB; i++) {
            if (!pertence(u, tamU, b[i])) {
                u[tamU] = b[i];
                tamU++;
            }
        }

        return tamU;
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

// tempo para fazer o código: 12 minutos