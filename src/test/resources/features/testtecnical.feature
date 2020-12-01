 #language: es

   @stories

Característica: Realizar busqueda de vestidos de mujeres en la pagina de new experiences
  Yo como usuario
  Quiero buscar vestidos de mujeres
  para comprar 2 de ellos

  @scenario1

  Escenario: Busqueda de vestidos exitosa
    Dado que Claudia quiere buscar vestidos
      |strUser    | strPassword |
      |acaraballo1101@gmail.com  | Gabriela-1803    |
    Cuando compra vestidos de mujeres
      |strPrenda| strComentario |
      |Dress| Por Favor llamar Antes de Llegar al sitio, Gracias |
    Entonces ella deberia visualizar que su compra fue exitosa
      |strConfirmacion|
      |Your order on My Store is complete.|