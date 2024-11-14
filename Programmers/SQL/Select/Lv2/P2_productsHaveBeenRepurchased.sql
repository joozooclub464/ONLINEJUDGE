#재구매가 일어난 상품과 회원 리스트 구하기
SELECT
    USER_ID,
    PRODUCT_ID
FROM ONLINE_SALE 
GROUP BY USER_ID, PRODUCT_ID
HAVING COUNT(*) > 1
ORDER BY USER_ID asc, PRODUCT_ID desc;


/*
having절 위치 : group by 다음
*/
