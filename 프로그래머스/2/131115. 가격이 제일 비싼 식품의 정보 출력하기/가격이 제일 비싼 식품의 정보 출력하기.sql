SELECT *
FROM FOOD_PRODUCT
WHERE PRICE = (SELECT MAX(PRICE) as PRICE from FOOD_PRODUCT);