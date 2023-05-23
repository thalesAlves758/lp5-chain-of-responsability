# Chain of Responsability
<div>
  <p>O presente repositório é dedicado a aplicar os conhecimentos adquiridos em sala de aula a respeito do Padrão de Projeto conhecido como Chain of Responsability. O contexto pensado para aplicar este padrão foi o seguinte:</p>

  <p>Imagina-se que o código implementado faça parte de um sistema para uma loja online. Essa loja então possui diversas formas de aplicar desconto no preço final de um pedido, dentre elas desconto através de cupom, desconto pelo preço total do pedido, desconto pela quantidade total de itens no pedido ou nenhum desconto, respeitando essa ordem. Para isso, foi utilizado o padrão Chain of Responsability, que no caso do exemplo, cria uma cadeia de descontos, onde cada tipo de desconto sabe se pode ou não ser aplicado no pedido, caso sim, retorna o valor do desconto, caso não passa para o próximo tipo de desconto caso houver.</p>
</div>
