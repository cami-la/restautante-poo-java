public class Main {

  public static void main(String[] args) {
    Endereco enderecoRestauranteCami = new Endereco();

    Endereco enderecoRestauranteCami2 = new Endereco("123456", "Endereço Restaurante Cami");
    Endereco enderecoRestauranteFulana = new Endereco("56646545", "Endereço Restaurante Fulana");

    Restaurante restaurante = new Restaurante();
    restaurante.setId(1L);
    restaurante.setNomeFantasia("Restaurante da Cami");
    restaurante.setCnpj("000.000.0001-11");
    restaurante.setEndereco(enderecoRestauranteCami2);
    System.out.println(restaurante);

    Restaurante restaurante2 = new Restaurante();
    restaurante2.setId(2L);
    restaurante2.setNomeFantasia("Restaurante da Fulana");
    restaurante2.setCnpj("000.000.0001-12");
    restaurante2.setEndereco(enderecoRestauranteFulana);
    System.out.println(restaurante2);



  }

}