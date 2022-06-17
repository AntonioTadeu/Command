class Carro {

    Carro Carro;

    @BeforeEach
    void setUp() {
        Carro = new Carro();
        Carro = new Carro (2021, 1);
    }

    @Test
    void deveAbrirCarro() {
        Tarefa aberturaCarro = new AberturaCarro(Carro);
        Carro.Carro(aberturaCarro);

        assertEquals("Carro Comprado", semestre.getCarro());
    }