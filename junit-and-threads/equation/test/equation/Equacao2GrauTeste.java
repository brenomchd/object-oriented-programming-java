package equation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Equacao2GrauTeste {
    @Test
    public void test1() {
        // Substituindo Xmat = 7, Ymat = 6
        Equacao2Grau eq = new Equacao2Grau(7, 6); 
        assertEquals(169, eq.calculaEquacao1()); // ResultadoEsperado1 = 169 (sucesso)
    }

    @Test
    public void test2() {
        // Substituindo Xmat = 7, Ymat = 6
        Equacao2Grau eq = new Equacao2Grau(7, 6); 
        assertEquals(0, eq.calculaEquacao2()); // ResultadoEsperado2 = 0 (fracasso proposital)
    }
}
