# language : es
Característica: Consultar Transaccion en MUREX
  Yo como usuario del aplicativo quiero consultar una transaccion
  para corroborar que las condiciones negociadas si sean las definidas

  @tag1
  Esquema del escenario: : Usuario desea consultar una transaccion en Murex
    Dado que el usuario se encuentra en el aplicatvo <usuario> <password> <grupo> <ruta>
    Cuando el ingresa el identificador de la transaccion deseada  <menu> <contracNumber>
    Entonces se debe visualizar el detalle

    Ejemplos: 
      | usuario | password | grupo      | menu        | contracNumber | ruta            |
      | USER1   | PASS1    | FO_TRD_BOG | TRADE QUERY |       8485294 | D:\\Nuevo_QA2\\ |
