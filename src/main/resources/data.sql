-- noinspection SqlNoDataSourceInspectionForFile


-- Insert FOODS

INSERT INTO FOODS VALUES (
  1,
  'MCCHICKEN',
  'Frango empanado e dourado com molho suave e cremoso, acompanhado de alface crocante num pão com gergelim.',
  '14.90'
);

INSERT INTO FOODS VALUES (
  2,
  'BIG TASTY',
  'O maior hambúrguer de carne 100% bovina do McDonald’s, 3 deliciosas fatias de queijo, tomate, alface crocante, cebola e o saboroso molho tasty',
  '21.90'
);

INSERT INTO FOODS VALUES (
  3,
  'CHEDDAR MCMELT',
  'Feito com carne bovina, delicioso queijo tipo cheddar derretido, cebola grelhada ao molho shoyu e para completar um pão escuro com gergelim.',
  '14.90'
);


INSERT INTO FOODS VALUES (
  4,
  'BIG MAC',
  'Dois hambúrgueres, alface, queijo e molho especial, cebola e picles num pão com gergelim.',
  '18.90'
);


--- Insert Options

INSERT INTO OPTIONS VALUES (
  1,
  'Lanche individual',
  '00.00',
  1 -- food_id
);

INSERT INTO OPTIONS VALUES (
  2,
  'Combo: batata média e refrigerante médio',
  '08.00',
  1 -- food_id
);

INSERT INTO OPTIONS VALUES (
  3,
  'Lanche individual',
  '00.00',
  2 -- food_id
);

INSERT INTO OPTIONS VALUES (
  4,
  'Combo: batata média e refrigerante médio',
  '08.00',
  2 -- food_id
);

INSERT INTO OPTIONS VALUES (
  5,
  'Lanche individual',
  '00.00',
  3 -- food_id
);

INSERT INTO OPTIONS VALUES (
  6,
  'Combo: batata média e refrigerante médio',
  '08.00',
  3 -- food_id
);

INSERT INTO OPTIONS VALUES (
  7,
  'Lanche individual',
  '00.00',
  4 -- food_id
);

INSERT INTO OPTIONS VALUES (
  8,
  'Combo: batata média e refrigerante médio',
  '08.00',
  4 -- food_id
);

-- Insert Additions

INSERT INTO ADDITIONS VALUES (
  1,
  'Maionese',
  '07.30',
  1 -- food_id
);

INSERT INTO ADDITIONS VALUES (
  2,
  'Blue Cheese',
  '12.00',
  1 -- food_id
);

INSERT INTO ADDITIONS VALUES (
  3,
  'Ovo',
  '03.00',
  2 -- food_id
);

INSERT INTO ADDITIONS VALUES (
  4,
  'Bacon',
  '06.00',
  2 -- food_id
);

INSERT INTO ADDITIONS VALUES (
  5,
  'Molho da casa',
  '06.00',
  3 -- food_id
);

INSERT INTO ADDITIONS VALUES (
  6,
  'Cheddar',
  '09.25',
  3 -- food_id
);

INSERT INTO ADDITIONS VALUES (
  7,
  'Purê de batata',
  '02.50',
  4 -- food_id
);

INSERT INTO ADDITIONS VALUES (
  8,
  'Bacon picado',
  '06.80',
  4 -- food_id
);