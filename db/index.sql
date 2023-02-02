CREATE INDEX product_id on product_mst (product_code);      /*product_mst 테이블에서 product_id 인덱스를 생성하는데 product_code를 기준으로 만들어라*/

show index from product_mst;


alter table product_mst
add unique product_name(product_name);


alter table product_mst
drop index product_id;
