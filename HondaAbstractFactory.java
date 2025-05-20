// Arquivo único: HondaAbstractFactory.java
public class HondaAbstractFactory {

    // Interfaces dos produtos
    interface Motor {
        String getTipo();
    }

    interface Chassi {
        String getTipo();
    }

    interface Rodas {
        String getTipo();
    }

    // Interface da Abstract Factory
    interface VeiculoFactory {
        Motor criarMotor();
        Chassi criarChassi();
        Rodas criarRodas();
    }

    // Implementações para Carros
    static class MotorCarro implements Motor {
        @Override
        public String getTipo() {
            return "2.0 Turbo (Carro)";
        }
    }

    static class ChassiCarro implements Chassi {
        @Override
        public String getTipo() {
            return "Chassi Sedan (Carro)";
        }
    }

    static class RodasCarro implements Rodas {
        @Override
        public String getTipo() {
            return "Rodas Liga Leve 18'' (Carro)";
        }
    }

    // Implementações para Motos
    static class MotorMoto implements Motor {
        @Override
        public String getTipo() {
            return "500cc (Moto)";
        }
    }

    static class ChassiMoto implements Chassi {
        @Override
        public String getTipo() {
            return "Chassi Esportivo (Moto)";
        }
    }

    static class RodasMoto implements Rodas {
        @Override
        public String getTipo() {
            return "Rodas Aro 17'' (Moto)";
        }
    }

    // Fábrica Concreta para Carros
    static class CarroFactory implements VeiculoFactory {
        @Override
        public Motor criarMotor() {
            return new MotorCarro();
        }

        @Override
        public Chassi criarChassi() {
            return new ChassiCarro();
        }

        @Override
        public Rodas criarRodas() {
            return new RodasCarro();
        }
    }

    // Fábrica Concreta para Motos
    static class MotoFactory implements VeiculoFactory {
        @Override
        public Motor criarMotor() {
            return new MotorMoto();
        }

        @Override
        public Chassi criarChassi() {
            return new ChassiMoto();
        }

        @Override
        public Rodas criarRodas() {
            return new RodasMoto();
        }
    }

    // Classe principal com exemplo de uso
    public static void main(String[] args) {
        // Criando uma fábrica de carros
        VeiculoFactory fabricaCarros = new CarroFactory();
        
        Motor motorCarro = fabricaCarros.criarMotor();
        Chassi chassiCarro = fabricaCarros.criarChassi();
        Rodas rodasCarro = fabricaCarros.criarRodas();

        System.out.println("Componentes do Carro:");
        System.out.println("- " + motorCarro.getTipo());
        System.out.println("- " + chassiCarro.getTipo());
        System.out.println("- " + rodasCarro.getTipo());

        // Criando uma fábrica de motos
        VeiculoFactory fabricaMotos = new MotoFactory();
        
        Motor motorMoto = fabricaMotos.criarMotor();
        Chassi chassiMoto = fabricaMotos.criarChassi();
        Rodas rodasMoto = fabricaMotos.criarRodas();

        System.out.println("\nComponentes da Moto:");
        System.out.println("- " + motorMoto.getTipo());
        System.out.println("- " + chassiMoto.getTipo());
        System.out.println("- " + rodasMoto.getTipo());
    }
}