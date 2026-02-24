SELECT 
    po.Company,
    ROUND(SUM(pd.Quantity * pr.Cost), 2) AS total_amount_spent
FROM Purchase_Order po
JOIN Purchase_Detail pd 
    ON po.ID = pd.ID
JOIN Product_Detail pr 
    ON pd.Product = pr.Product
GROUP BY po.Company
ORDER BY total_amount_spent DESC;